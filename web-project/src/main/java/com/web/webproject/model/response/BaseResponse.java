package com.web.webproject.model.response;

import com.web.webproject.enums.ApiStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Base response.
 *
 * @param <T> the type parameter
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BaseResponse<T> {

  /**
   * The Code.
   */
  @Builder.Default
  private String code = "ES200";

  /**
   * The Message.
   */
  @Builder.Default
  private String message = "Success";

  /**
   * The Data.
   */
  private T data;

//  private int total = 0;

  /**
   * The Response time.
   */
  @Builder.Default
  private long responseTime = System.currentTimeMillis();

  /**
   * Instantiates a new Base response.
   *
   * @param apiStatus the api status
   */
  public BaseResponse(ApiStatus apiStatus) {
    responseTime = System.currentTimeMillis();
    this.code = apiStatus.getCode();
    this.message = apiStatus.getMessage();
  }

  /**
   * Instantiates a new Base response.
   *
   * @param data the data
   */
  public BaseResponse(T data) {
    responseTime = System.currentTimeMillis();
    this.code = ApiStatus.SUCCESS.getCode();
    this.message = ApiStatus.SUCCESS.getMessage();
    this.data = data;
  }
}
