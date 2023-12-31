package com.web.webproject.exception;

/**
 * The type Bad request exception.
 */
public class BadRequestException extends RuntimeException {

  /**
   * The constant serialVersionUID.
   */
  private static final long serialVersionUID = -6069656061564298561L;

  /**
   * Instantiates a new Bad request exception.
   *
   * @param message the message
   */
  public BadRequestException(String message) {
    super(message);
  }
}
