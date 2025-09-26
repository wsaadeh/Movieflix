package com.saadeh.Movieflix.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class ValidationErrorDto extends StandardErrorDto {
 private List<FieldMessageDto> errors = new ArrayList<>();

 public void addError(String fieldName, String message){
     errors.removeIf(x->x.getFieldName().equals(fieldName));
     errors.add(new FieldMessageDto(fieldName,message));
 }
}
