/*
 * Created on September 9, 2013
 * 
 * @(#)Bootstrap.java	
 * 
 */
package org.dev.emmanuel.cms.config;

import java.io.File;

import org.productivity.java.habitat4j.Habitat4JBootstrap;
import org.productivity.java.habitat4j.PropertyListManager;
import org.productivity.java.habitat4j.ServerIdentityManager;
import org.productivity.java.habitat4j.common.Habitat4JConstants;
import org.productivity.java.habitat4j.common.Habitat4JFeatures;
import org.productivity.java.habitat4j.common.PropertyHash;
import org.productivity.java.habitat4j.common.exception.PropertyListHandlerException;

/**
 *
 * @author Emmanuel Akolly
 * @version 1.0
 * @since Sep 9 2013
 */
public class Bootstrap {

	private static final String SERVER_IDENTITY_FILE = "/server-identity.xml";
	public static final String DEFAULT_FILE_SEPARATOR = "/";
	public static final String BOOTSTRAP_APP_NAME  = "CMS";

	// Main property file for the CMS application
	// Add more property file as needed but remember to load it 
	// in the initialize() method
	public static final String CMS_PROP_LKUP_DEFAULT_PATH  = "/CMSPropLkup.xml";


	public static final String CMS_PROPERTY_LIST_NAME = "CMSPropLkup";

	// The "server-identity.xml" file will be searched for in these directories. 
	// First one to match is the one that loads.
	public static final String[] BOOTSTRAP_SERVER_IDENTITY_DIRS = new String[] {"d:/projects/cms/properties", "D:/Projects/CMS", "D:/Projects/CMS/properties", "/etc/projects/cms", "/usr/local/projects/cms"};

	// The "AppPropLkup.xml" or any other property file will be searched for in these directories. 
	// First one to match is the one that loads.
	public static final String[] PROPERTY_FILES_DIRS = new String[] {"d:/projects/cms/properties", "D:/Projects/CMS", "D:/Projects/CMS/properties", "/etc/projects/cms", "/usr/local/projects/cms"};

	static {
		initialize();
	}

	private static void initialize() {
		try {
			ServerIdentityManager.reset();
			PropertyListManager.reset();

			String serverIdentityFile = SERVER_IDENTITY_FILE;
			String serverIdentityPath = Habitat4JBootstrap.createServerIdentityPath(serverIdentityFile,BOOTSTRAP_SERVER_IDENTITY_DIRS);
			System.setProperty(Habitat4JConstants.HABITAT4J_SAX_DRIVER_SYSTEM_PROPERTY_NAME,"org.apache.xerces.parsers.SAXParser");
			PropertyListManager.initialize(BOOTSTRAP_APP_NAME);
			System.setProperty(Habitat4JConstants.HABITAT4J_SERVER_IDENTITY_FILE_PATH_SYSTEM_PROPERTY_NAME,serverIdentityPath);
			PropertyListManager.setFeature(Habitat4JFeatures.PROPERTY_LIST_FEATURE_SUPPRESS_PROPERTY_BEAN_COPY_WARNINGS,true);
			PropertyListManager.setFeature(Habitat4JFeatures.PROPERTY_LIST_FEATURE_DATE_RELOAD,true);
			PropertyListManager.setFeature(Habitat4JFeatures.PROPERTY_LIST_FEATURE_DATE_RELOAD_ON_THE_FLY,true);
			PropertyListManager.reloadOnFileChange();
			PropertyListManager.loadPropertyListFromFile(createPropertyFilePath(CMS_PROP_LKUP_DEFAULT_PATH,PROPERTY_FILES_DIRS));

		}  catch (PropertyListHandlerException plhe) {
			usage();
			throw new RuntimeException(plhe.toString());
		}
	}

	/**
	 * 
	 * @param hashName
	 * @param key
	 * @return
	 */
	public static String getProperty(String hashName, String key){
		return PropertyListManager.getPropertyHashValue("CMSPropLkup",hashName, key);
	}

	

	/**
	 * 
	 * @param propertyListName
	 * @param name
	 * @return
	 */
	public static PropertyHash getPropertyHash(String propertyListName, String name){
		return PropertyListManager.getPropertyHash(propertyListName,name);
	}

	/**
	 * 
	 * @param propertyFileName
	 * @param directories
	 * @return
	 */
	private static String createPropertyFilePath(String propertyFileName, String[] directories) {
		String _propertyFileName = propertyFileName;
		File propertyPath = null;

		if (_propertyFileName == null || _propertyFileName.trim().equals("")) {
			_propertyFileName = CMS_PROP_LKUP_DEFAULT_PATH;
		}

		if (directories == null || directories.length < 1) {
			return _propertyFileName;
		}

		if (_propertyFileName.charAt(0) == '/' || _propertyFileName.charAt(0) == '\\') {
			_propertyFileName = _propertyFileName.substring(1);
		}

		StringBuilder path = new StringBuilder();
		String separator = System.getProperty("file.separator");
		if (separator == null || separator.equals("")) {
			separator = DEFAULT_FILE_SEPARATOR;
		}

		for (int i=0; i<directories.length; i++) {
			path.setLength(0);
			path.append(directories[i]);
			path.append(separator);
			path.append(_propertyFileName);

			propertyPath = new File(path.toString());
			if(propertyPath.exists() && propertyPath.canRead()){
				break;
			}
		}
		return path.toString();
	}


	private static void usage(){
		System.out.println("/*******************************************************************************************/");
		System.out.println("/*\tMake sure the serverIdentity.xml file is in one of the following locations: ");
		for(int i = 0; i < BOOTSTRAP_SERVER_IDENTITY_DIRS.length; i ++){
			System.out.println("/*\t" + BOOTSTRAP_SERVER_IDENTITY_DIRS[i]);
		}
		System.out.println("");
		System.out.println("");
		System.out.println("/*\tMake sure your property file e.g PCRCPPropLkup.xml is in one of the following locations: */");
		for(int i = 0; i < PROPERTY_FILES_DIRS.length; i ++){
			System.out.println("/*\t" + PROPERTY_FILES_DIRS[i]);
		}
		System.out.println("/*");
		System.out.println("/*");
		System.out.println("/*");
		System.out.println("/*");
		System.out.println("/*");
		System.out.println("/*******************************************************************************************/");
	}

	//For debugging purpose
	/*
	public static void main(String[] args){
		String value = Bootstrap.getProperty(WMStaticConstants.WEALTH_MGMT_MODULE_NAME,WMStaticConstants.BASE_DRIVE);
		String apiKey = StaticResourceFactory.getProperty(WMStaticConstants.WEALTH_MGMT_MODULE_NAME,WMStaticConstants.GOOGLE_API_KEY);
		System.out.println(value);
		System.out.println("The API KEY IS :: " + apiKey);

		//String value2 = Bootstrap.getTestProperty("states","AZ");
		//System.out.println("VALUE ::: " + value2);
		//System.out.println(PropertyListManager.getServerIdentity().getEnvironment());
		//System.out.println(PropertyListManager.getPropertyList("PCRCPPropLkup"));
	}*/
}
