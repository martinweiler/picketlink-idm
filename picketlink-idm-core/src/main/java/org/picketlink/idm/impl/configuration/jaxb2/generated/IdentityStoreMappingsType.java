//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.12.18 at 03:00:04 PM CET 
//


package org.picketlink.idm.impl.configuration.jaxb2.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for identity-store-mappingsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="identity-store-mappingsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identity-store-mapping" type="{urn:picketlink:idm:config:v1_0_0_ga}identity-store-mappingType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "identity-store-mappingsType", propOrder = {
    "identityStoreMapping"
})
public class IdentityStoreMappingsType {

    @XmlElement(name = "identity-store-mapping")
    protected List<IdentityStoreMappingType> identityStoreMapping;

    /**
     * Gets the value of the identityStoreMapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identityStoreMapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentityStoreMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentityStoreMappingType }
     * 
     * 
     */
    public List<IdentityStoreMappingType> getIdentityStoreMapping() {
        if (identityStoreMapping == null) {
            identityStoreMapping = new ArrayList<IdentityStoreMappingType>();
        }
        return this.identityStoreMapping;
    }

}
