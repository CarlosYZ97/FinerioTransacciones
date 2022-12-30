package pe.finerio.app.connector.service.apiconnect;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import pe.finerio.app.restclient.transaction.response.TransactionResponseDTO;

@FeignClient(url="${rest.clients.finerio.config.url}", name = "finerio")
public interface ApiTransactionClient {

    @GetMapping(name = "get-transactions", value = "${rest.clients.finerio.services.get-transactions.uri}")
    ResponseEntity<TransactionResponseDTO> getTransactions(@RequestHeader("Authorization") String bearerToken, @PathVariable("idUser") String idUser, @PathVariable("page") Integer page, @PathVariable("limit") Integer limit);
}
