package pe.finerio.app.connector.service.apiconnect;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pe.finerio.app.restclient.authentication.request.AuthenticationRequestDTO;
import pe.finerio.app.restclient.authentication.response.AuthenticationResponseDTO;

@FeignClient(url="${rest.clients.finerio.config.url}", name = "finerio")
public interface ApiAuthenticationClient {

    @PostMapping(name = "authentication", value = "${rest.clients.finerio.services.authentication.uri}")
    ResponseEntity<AuthenticationResponseDTO> login(@RequestBody AuthenticationRequestDTO authenticationRequestDTO);
}
