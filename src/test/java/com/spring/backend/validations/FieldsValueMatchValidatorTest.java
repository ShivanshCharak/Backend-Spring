package com.spring.backend.validations;

import com.spring.backend.annotation.FieldsValueMatch;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.*;

class FieldsValueMatchValidatorTest implements ConstraintValidator<FieldsValueMatch,Object> {

    @Autowired
    private FieldsValueMatchValidator fieldsvalue;
    private void returnValue(FieldsValueMatch constratints){
        assertThat(constratints.field()).isEqualTo(constratints.fieldMatch());
    }

    @Override
    public void initialize(FieldsValueMatch constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
        return false;
    }
}