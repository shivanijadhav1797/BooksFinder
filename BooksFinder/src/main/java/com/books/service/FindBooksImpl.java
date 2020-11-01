package com.books.service;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.books.model.Book;

@Service
public class FindBooksImpl {

	private static final String GOOGLE_BOOKS_API_URL = "https://www.googleapis.com/books/v1/volumes";
	
	public Book getBooksData(String searchValue, String filter, String language, String download, String maxResults, String printType, String orderBy){
				
		UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(GOOGLE_BOOKS_API_URL)
                .queryParam("q", searchValue);
	
		if(null != filter) {
			uriBuilder.queryParam("filter", filter);
		}
		
		if(null != language) {
			uriBuilder.queryParam("language", language);
		}
		
		if(null != download) {
			uriBuilder.queryParam("download", download);
		}
		
		if(null != maxResults) {
			uriBuilder.queryParam("maxResults", maxResults);
		}
		
		if(null != printType) {
			uriBuilder.queryParam("printType", printType);
		}
		
		if(null != orderBy) {
			uriBuilder.queryParam("orderBy", orderBy);
		}
		
		
		return restCallGoogleBooksApi(uriBuilder);
	}
	
	private Book restCallGoogleBooksApi(UriComponentsBuilder uriBuilder) {
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<Book> responseJson = restTemplate.exchange(
				uriBuilder.toUriString(),
		        HttpMethod.GET,
		        null,
		        Book.class
		);
		
		ResponseEntity<String> response = restTemplate.exchange(
				uriBuilder.toUriString(),
		        HttpMethod.GET,
		        null,
		        String.class
		);
		
		System.out.println(response.toString());
		return responseJson.getBody();
	}
	
}
