package com.pardhu.authdemo.utils;

import java.io.Serializable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JWTUtils implements Serializable {

  private static final long serialVersionUID = 234234523523L;

  public static final long JWT_TOKEN_VALIDITY = 5 * 60 * 60;

  @Value("${jwt.secret}")
  private String secretKey;



}
