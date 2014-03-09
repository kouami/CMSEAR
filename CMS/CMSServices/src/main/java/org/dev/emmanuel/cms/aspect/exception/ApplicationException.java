package org.dev.emmanuel.cms.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Emmanuel
 */
@SuppressWarnings("serial")
public class ApplicationException extends RuntimeException {

	private SimpleDateFormat format = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
	private String errorCode;
	private String errorMessage;
	private Date currentDate;

	public ApplicationException() {
	}

	public ApplicationException(Date now, String errorCode, String errorMessage){
		this.currentDate = now;
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public ApplicationException(String message) {
		super(message);
	}

	public ApplicationException(String message, Throwable cause) {
		super(message, cause);
	}

	public ApplicationException(Throwable cause) {
		super(cause);
	}

	/**
	 * @return the format
	 */
	public SimpleDateFormat getFormat() {
		return format;
	}

	/**
	 * @return the errorCode
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * @return the errorMessage
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * @return the now
	 */
	public Date getCurrentDate() {
		Date formattedDate = null;
		currentDate = new Date();
		try {
			formattedDate = format.parse(currentDate.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return formattedDate;
	}

	/**
	 * @param errorCode the errorCode to set
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	/**
	 * @param errorMessage the errorMessage to set
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	/**
	 * @param currentDate the currentDate to set
	 */
	public void setCurrentDate(Date currentDate) {
		this.currentDate = currentDate;
	}
} 