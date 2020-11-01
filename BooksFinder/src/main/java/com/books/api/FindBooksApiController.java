package com.books.api;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.books.model.Book;
import com.books.service.FindBooksImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.annotations.ApiParam;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-29T11:16:10.424Z[GMT]")
@Controller
public class FindBooksApiController implements FindBooksApi {

	private static final Logger log = LoggerFactory.getLogger(FindBooksApiController.class);

	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;

	@Autowired
	FindBooksImpl findBooksImpl;

	@org.springframework.beans.factory.annotation.Autowired
	public FindBooksApiController(ObjectMapper objectMapper, HttpServletRequest request) {
		this.objectMapper = objectMapper;
		this.request = request;
	}

	public ResponseEntity<Book> findBooks(
			@ApiParam(value = "search value", required = true) @PathVariable("searchValue") String searchValue,
			@ApiParam(value = "filter", required = false) @RequestParam(value = "filter", required = false) String filter,
			@ApiParam(value = "language", required = false) @RequestParam(value = "language", required = false) String language,
			@ApiParam(value = "download", required = false) @RequestParam(value = "download", required = false) String download,
			@ApiParam(value = "maxResults", required = false) @RequestParam(value = "maxResults", required = false) String maxResults,
			@ApiParam(value = "printType", required = false) @RequestParam(value = "printType", required = false) String printType,
			@ApiParam(value = "orderBy", required = false) @RequestParam(value = "orderBy", required = false) String orderBy) {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			try {
				return new ResponseEntity<Book>(findBooksImpl.getBooksData(searchValue, filter, language, download, maxResults, printType, orderBy), HttpStatus.OK);
			} catch (Exception e) {
				log.error("Couldn't serialize response for content type application/json", e);
				return new ResponseEntity<Book>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		return new ResponseEntity<Book>(HttpStatus.NOT_IMPLEMENTED);
	}

}
