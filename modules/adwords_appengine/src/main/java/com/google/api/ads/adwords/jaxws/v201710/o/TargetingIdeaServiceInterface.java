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


package com.google.api.ads.adwords.jaxws.v201710.o;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Use this service to generate new keyword ideas based on the
 *       parameters specified in the selector. See the {@link TargetingIdeaSelector}
 *       documentation for more details.
 *       
 *       <p>You can also use this service to retrieve statistics for existing keyword
 *       ideas by setting the selector's {@code requestType} to {@link RequestType#STATS}
 *       and passing in the appropriate search parameters.</p>
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "TargetingIdeaServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/o/v201710")
@XmlSeeAlso({
    com.google.api.ads.adwords.jaxws.v201710.cm.ObjectFactory.class,
    com.google.api.ads.adwords.jaxws.v201710.o.ObjectFactory.class
})
public interface TargetingIdeaServiceInterface {


    /**
     * 
     *         Returns a page of ideas that match the query described by the specified
     *         {@link TargetingIdeaSelector}.
     *         
     *         <p>The selector must specify a {@code paging} value, with {@code numberResults} set to 700 or
     *         less.  Large result sets must be composed through multiple calls to this method, advancing the
     *         paging {@code startIndex} value by {@code numberResults} with each call.</p>
     *         
     *         @param selector Query describing the types of results to return when
     *         finding matches (similar keyword ideas).
     *         @return A {@link TargetingIdeaPage} of results, that is a subset of the
     *         list of possible ideas meeting the criteria of the
     *         {@link TargetingIdeaSelector}.
     *         @throws ApiException If problems occurred while querying for ideas.
     *       
     * 
     * @param selector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201710.o.TargetingIdeaPage
     * @throws ApiException
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/o/v201710")
    @RequestWrapper(localName = "get", targetNamespace = "https://adwords.google.com/api/adwords/o/v201710", className = "com.google.api.ads.adwords.jaxws.v201710.o.TargetingIdeaServiceInterfaceget")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "https://adwords.google.com/api/adwords/o/v201710", className = "com.google.api.ads.adwords.jaxws.v201710.o.TargetingIdeaServiceInterfacegetResponse")
    public TargetingIdeaPage get(
        @WebParam(name = "selector", targetNamespace = "https://adwords.google.com/api/adwords/o/v201710")
        TargetingIdeaSelector selector)
        throws ApiException
    ;

}
