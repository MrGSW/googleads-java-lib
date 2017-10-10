// Copyright 2017 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.google.api.ads.adwords.jaxws.v201710.cm;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Use the {@code BatchJobService} to schedule large batches of updates to
 *       your AdWords campaigns as asynchronous mutate jobs, and to retrieve the
 *       status, results or statistics of your recent jobs.
 *       
 *       <p>Use this service when you wish to release your application from actively
 *       waiting on a synchronous response. Your application can do other things or
 *       even shutdown while we execute mutations asynchronously.
 *       
 *       <p>Once a job has been submitted, you may check its status periodically, by
 *       calling {@link #get}.
 *       
 *       <p class="caution"><b>Caution:</b> Do not poll the job status too frequently
 *       or you will risk getting your customer rate-limited.
 *       
 *       <p>Once a job's status changes to {@code DONE}, you can retrieve the job's
 *       results.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "BatchJobServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201710")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BatchJobServiceInterface {


    /**
     * 
     *         Query the status of existing {@code BatchJob}s.
     *         
     *         @param selector The selector specifying the {@code BatchJob}s to return.
     *         @return The list of selected jobs.
     *         @throws ApiException
     *       
     * 
     * @param selector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201710.cm.BatchJobPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201710")
    @RequestWrapper(localName = "get", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201710", className = "com.google.api.ads.adwords.jaxws.v201710.cm.BatchJobServiceInterfaceget")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201710", className = "com.google.api.ads.adwords.jaxws.v201710.cm.BatchJobServiceInterfacegetResponse")
    public BatchJobPage get(
        @WebParam(name = "selector", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201710")
        Selector selector)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Creates or updates a {@code BatchJob}.
     *         
     *         <p class="note"><b>Note:</b> {@link BatchJobOperation} does not support the
     *         {@code REMOVE} operator. It is not necessary to remove BatchJobs.
     *         
     *         @param operations A list of operations.
     *         @return The list of created or updated jobs.
     *         @throws ApiException
     *       
     * 
     * @param operations
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201710.cm.BatchJobReturnValue
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201710")
    @RequestWrapper(localName = "mutate", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201710", className = "com.google.api.ads.adwords.jaxws.v201710.cm.BatchJobServiceInterfacemutate")
    @ResponseWrapper(localName = "mutateResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201710", className = "com.google.api.ads.adwords.jaxws.v201710.cm.BatchJobServiceInterfacemutateResponse")
    public BatchJobReturnValue mutate(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201710")
        List<BatchJobOperation> operations)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns the list of {@code BatchJob}s that match the query.
     *         
     *         @param query The SQL-like AWQL query string.
     *         @return The list of selected jobs.
     *         @throws ApiException if problems occur while parsing the query or fetching
     *         batchjob information.
     *       
     * 
     * @param query
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201710.cm.BatchJobPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201710")
    @RequestWrapper(localName = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201710", className = "com.google.api.ads.adwords.jaxws.v201710.cm.BatchJobServiceInterfacequery")
    @ResponseWrapper(localName = "queryResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201710", className = "com.google.api.ads.adwords.jaxws.v201710.cm.BatchJobServiceInterfacequeryResponse")
    public BatchJobPage query(
        @WebParam(name = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201710")
        String query)
        throws ApiException_Exception
    ;

}
