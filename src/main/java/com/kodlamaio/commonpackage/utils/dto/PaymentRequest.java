package com.kodlamaio.commonpackage.utils.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PaymentRequest {
    @NotBlank(message = "Kart numarası alanı boş bırakılamaz.")
    @Length(min = 16, max = 16, message = "Kart numarası 16 haneden oluşmalıdır.")
    private String cardNumber; // 16 haneli

    @NotBlank(message = "Kart sahibi bilgisi boş bırakılamaz")
    @Length(min = 5, message = "Kart sahibi bilgisi en az 5 karakterden oluşmalıdır.")
    private String cardHolder;

    @NotNull(message = "Kartın son kullanma yılı boş bırakılamaz.")
    @Min(value = 2023, message = "Kart son kullanma yılı geçersiz.")
    private int cardExpirationYear; // minimum 2023

    @Max(value = 12)
    @Min(value = 1)
    private int cardExpirationMonth; // 1 ile 12

    @NotBlank(message = "Cvv bilgisi boş bırakılamaz")
    @Length(min = 3, max = 3, message = "Cvv numarası 3 haneli olmalıdır.")
    private String cardCvv; // 3 haneli olmalı
}


