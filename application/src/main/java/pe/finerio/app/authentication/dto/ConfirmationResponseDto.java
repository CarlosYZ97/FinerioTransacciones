package pe.finerio.app.authentication.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class ConfirmationResponseDto {

    public final boolean ok;

    public static ConfirmationResponseDto of(boolean bln) {
        return new ConfirmationResponseDto(bln);
    }

    public static ConfirmationResponseDto ok(){
        return new ConfirmationResponseDto(true);
    }

    public static ConfirmationResponseDto error(){
        return new ConfirmationResponseDto(false);
    }
}
