package pe.finerio.app.connector.service.apiconnect;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import pe.finerio.app.restclient.user.response.UserResponseDTO;

@FeignClient(url="${rest.clients.finerio.config.url}", name = "finerio")
public interface ApiUserClient {

    @GetMapping(name = "get-user", value = "${rest.clients.finerio.services.get-user.uri}")
    ResponseEntity<UserResponseDTO> getUser(@RequestHeader("Authorization") String bearerToken);

}
