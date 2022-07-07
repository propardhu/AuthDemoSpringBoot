package com.pardhu.authdemo.domain;

import java.io.Serializable;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "Users")
public class User implements Serializable {

  @Id
  private String id;

  @Field("username")
  @Indexed(unique = true, direction = IndexDirection.DESCENDING)
  private String username;

  @Field("phone")
  private String phone;

  @Field("password")
  private String password;
}
