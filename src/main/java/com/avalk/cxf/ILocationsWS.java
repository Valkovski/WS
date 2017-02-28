package com.avalk.cxf;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by Abrams on 18.07.2016.
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface ILocationsWS {


    @WebMethod()
    LibraryWSResponse getAllBooks();

//    @WebMethod()
//    LibraryWSResponse getBookByName(
//            @WebParam (partName ="bookName") String name);
//
//    @WebMethod()
//    LibraryWSResponse getBookById(
//            @WebParam(partName ="bookId") Integer id);
//
//    @WebMethod()
//    LibraryWSResponse getBooksByAuthor(
//            @WebParam(partName ="bookAuthor") String author);
//
//    @WebMethod()
//    LibraryWSResponse giveBackBook(@WebParam(partName ="bookToGiveBack") Book book);
//
//    @WebMethod()
//    LibraryWSResponse changeBook(
//            @WebParam(partName ="oldBook") Book oldBook,
//            @WebParam(partName ="newBook") Book newBook);
//
//    @WebMethod()
//    LibraryWSResponse deleteBook(
//            @WebParam(partName ="bookId") Integer id);




}
