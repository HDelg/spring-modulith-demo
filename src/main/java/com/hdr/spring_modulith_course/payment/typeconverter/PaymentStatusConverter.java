package com.hdr.spring_modulith_course.payment.typeconverter;

import java.util.Arrays;

import com.hdr.spring_modulith_course.payment.type.PaymentStatus;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class PaymentStatusConverter implements AttributeConverter<PaymentStatus, String> {

    @Override
    public String convertToDatabaseColumn(PaymentStatus status) {
        if(status == null) throw new IllegalArgumentException("Status cannot be null");
        return status.getCode();
    };
    
    @Override
    public PaymentStatus convertToEntityAttribute(String code) {
        if(code == null) throw new IllegalArgumentException("Code can not be null");
        return Arrays.stream(PaymentStatus.values())
                .filter(s -> s.getCode().equalsIgnoreCase(code))
                .findFirst().orElseThrow(IllegalArgumentException::new);
    }
}
