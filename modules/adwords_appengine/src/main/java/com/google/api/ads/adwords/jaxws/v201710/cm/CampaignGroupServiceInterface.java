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
 *       Use this service to manage campaign groups. A {@link CampaignGroup} organizes one or more
 *       campaigns together and has its own budget.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "CampaignGroupServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201710")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CampaignGroupServiceInterface {


    /**
     * 
     *         Returns the list of campaign groups that meet the selector criteria.
     *         
     *         @param selector specifying the {@link CampaignGroup}s to return.
     *         @return A list of campaign groups.
     *         @throws ApiException if problems occurred while fetching campaign group information.
     *       
     * 
     * @param selector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201710.cm.CampaignGroupPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201710")
    @RequestWrapper(localName = "get", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201710", className = "com.google.api.ads.adwords.jaxws.v201710.cm.CampaignGroupServiceInterfaceget")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201710", className = "com.google.api.ads.adwords.jaxws.v201710.cm.CampaignGroupServiceInterfacegetResponse")
    public CampaignGroupPage get(
        @WebParam(name = "selector", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201710")
        Selector selector)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Adds, updates, or deletes campaign groups.
     *         
     *         @param operations A list of unique operations.
     *         @return The list of updated campaign groups, returned in the same order as the
     *         {@code operations} array.
     *         @throws ApiException if problems occurred while updating campaign group information.
     *       
     * 
     * @param operations
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201710.cm.CampaignGroupReturnValue
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201710")
    @RequestWrapper(localName = "mutate", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201710", className = "com.google.api.ads.adwords.jaxws.v201710.cm.CampaignGroupServiceInterfacemutate")
    @ResponseWrapper(localName = "mutateResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201710", className = "com.google.api.ads.adwords.jaxws.v201710.cm.CampaignGroupServiceInterfacemutateResponse")
    public CampaignGroupReturnValue mutate(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201710")
        List<CampaignGroupOperation> operations)
        throws ApiException_Exception
    ;

}
