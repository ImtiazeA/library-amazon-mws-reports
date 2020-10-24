
package com.amazonaws.mws.model;

import java.io.InputStream;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Generated by AWS Code Generator, but contains hand additions for streaming and Content-MD5 support
 * <p/>
 * Tue Feb 03 16:00:09 PST 2009
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "marketplace",
    "marketplaceIdList",
    "merchant",
    "feedContent",
    "contentMD5",
    "feedType",
    "purgeAndReplace",
    "mwsAuthToken",
    "feedOptions"
})
@XmlRootElement(name = "SubmitFeedRequest")
public class SubmitFeedRequest {

    @XmlElement(name = "Marketplace")
    protected String marketplace;
    @XmlElement(name = "MarketplaceIdList")
    protected IdList marketplaceIdList;
    @XmlElement(name = "Merchant", required = true)
    protected String merchant;
    @XmlElement(name = "FeedContent", required = true)
    protected InputStream feedContent;
    @XmlElement(name = "ContentMD5", required = true)
    protected String contentMD5;
    @XmlElement(name = "FeedType", required = true)
    protected String feedType;
    @XmlElement(name = "PurgeAndReplace")
    protected Boolean purgeAndReplace;
    @XmlElement(name = "FeedOptions")
    protected String feedOptions;

    @XmlTransient
    protected ContentType contentType = null;

    @XmlElement(name = "MWSAuthToken")
    protected String mwsAuthToken;
    
    /**
     * Default constructor
     * 
     */
    public SubmitFeedRequest() {
        super();
        
        // By default, use a content type of octet-stream
        this.contentType = ContentType.OctetStream;
    }

    /**
     * Value constructor
     * 
     */
    public SubmitFeedRequest(final String marketplace, final IdList marketplaceIdList, final String merchant,
            final InputStream feedContent, final String contentMD5, final String feedType, final Boolean purgeAndReplace) {
        this(marketplace, merchant, feedContent, contentMD5, feedType, purgeAndReplace, null);
    }

    public SubmitFeedRequest(final String marketplace, final IdList marketplaceIdList, final String merchant,
            final InputStream feedContent, final String contentMD5, final String feedType, final Boolean purgeAndReplace,
            final String mwsAuthToken ) {
        this(marketplace, marketplaceIdList, merchant, feedContent, contentMD5, feedType, purgeAndReplace, mwsAuthToken,
                null);
    }

    public SubmitFeedRequest(final String marketplace, final IdList marketplaceIdList, final String merchant,
            final InputStream feedContent, final String contentMD5, final String feedType, final Boolean purgeAndReplace,
            final String mwsAuthToken, String feedOptions) {
        this();

        this.marketplace = marketplace; 
        this.marketplaceIdList = marketplaceIdList;
        this.merchant = merchant;
        this.feedContent = feedContent;
        this.contentMD5 = contentMD5;
        this.feedType = feedType;
        this.purgeAndReplace = purgeAndReplace;
        this.mwsAuthToken = mwsAuthToken;
        this.feedOptions = feedOptions;
    }

    public SubmitFeedRequest(final String marketplace, final String merchant, final InputStream feedContent,
            final String contentMD5, final String feedType, final Boolean purgeAndReplace) {
        this(marketplace, merchant, feedContent, contentMD5, feedType, purgeAndReplace, null);
    }

    public SubmitFeedRequest(final String marketplace, final String merchant, final InputStream feedContent,
            final String contentMD5, final String feedType, final Boolean purgeAndReplace, final String mwsAuthToken) {
        this();

        this.marketplace = marketplace;
        this.merchant = merchant;
        this.feedContent = feedContent;
        this.contentMD5 = contentMD5;
        this.feedType = feedType;
        this.purgeAndReplace = purgeAndReplace;
        this.mwsAuthToken = mwsAuthToken;
    }

    public SubmitFeedRequest(final String marketplace, final IdList marketplaceIdList, final String merchant, final InputStream feedContent, final String contentMD5, final String feedType, final Boolean purgeAndReplace, final ContentType contentType) {
    	this(marketplace, marketplaceIdList, merchant, feedContent, contentMD5, feedType, purgeAndReplace);
    	setContentType(contentType);
    }
    
    public SubmitFeedRequest(final String marketplace, final IdList marketplaceIdList, final String merchant,
            final InputStream feedContent, final String contentMD5, final String feedType, final Boolean purgeAndReplace,
            final ContentType contentType, final String mwsAuthToken) {
        this(marketplace, marketplaceIdList, merchant, feedContent, contentMD5, feedType, purgeAndReplace, mwsAuthToken,
                null);
        setContentType(contentType);
    }
    
    /**
     * 
     * @param marketplaceIdList
     */
    
    public void setMarketplaceIdList(IdList marketplaceIdList) {
        this.marketplaceIdList = marketplaceIdList;
    }
    
    public IdList getMarketplaceIdList() {
        return marketplaceIdList;
    }
    
    public SubmitFeedRequest withMarketplaceIdList(IdList marketplaceIdList) {
        setMarketplaceIdList(marketplaceIdList);
        return this;
    }
    
    public boolean isSetMarketplaceIdList() {
        return marketplaceIdList != null;
    }


    /**
     * Gets the value of the content type.
     * 
     * @return
     *     possible object is
     *     {@link ContentType }
     *     
     */
    public ContentType getContentType() {
    	return this.contentType;
    }


    /**
     * Sets the value of the ContentType property
     * 
     * @param value
     * @return
     *     this instance
     */
    public SubmitFeedRequest withContentType(ContentType value) {
        this.setContentType(value);
        return this;
    }
    
    /**
     * Sets the value of the ContentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentType }
     *     
     */
    public void setContentType(ContentType value) {
        this.contentType = value;
    }

    public boolean isSetContentType() {
        return (this.contentType!= null);
    }

    
    /**
     * Gets the value of the marketplace property.
     * @deprecated  See {@link #setMarketplace(String)}
     * 
     * @deprecated  See {@link #setMarketplace(String)}
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketplace() {
        return marketplace;
    }

    /**
     * Sets the value of the marketplace property.
     * @deprecated Not used anymore.  MWS ignores this parameter, but it is left
     * in here for backwards compatibility.
     * Use {@link #setMarketplaceIdList(IdList)} instead.
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketplace(String value) {
        this.marketplace = value;
    }

    /**
     * @deprecated  See {@link #setMarketplace(String)}
     */
    public boolean isSetMarketplace() {
        return (this.marketplace!= null);
    }

    /**
     * Gets the value of the merchant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchant() {
        return merchant;
    }

    /**
     * Sets the value of the merchant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchant(String value) {
        this.merchant = value;
    }

    public boolean isSetMerchant() {
        return (this.merchant!= null);
    }

    /**
     * Gets the value of the feedContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public InputStream getFeedContent() {
        return feedContent;
    }

    /**
     * Sets the value of the feedContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedContent(InputStream value) {
        this.feedContent = value;
    }

    public boolean isSetFeedContent() {
        return (this.feedContent!= null);
    }

    
    public String getContentMD5() {
        return contentMD5;
    }

    public void setContentMD5(String value) {
        this.contentMD5 = value;
    }

    public boolean isSetContentMD5() {
        return (this.contentMD5!= null);
    }

    public void setFeedOptions(String feedOptions) {
        this.feedOptions = feedOptions;
    }

    public String getFeedOptions() {
        return feedOptions;
    }

    public boolean isSetFeedOptions() {
        return (this.feedOptions != null);
    }

    /**
     * Gets the value of the feedType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedType() {
        return feedType;
    }

    /**
     * Sets the value of the feedType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedType(String value) {
        this.feedType = value;
    }

    public boolean isSetFeedType() {
        return (this.feedType!= null);
    }
    
    /**
     * Gets the value of the mwsAuthToken property.
     * 
     * possible object is
     *     {@link String}
     */
    public String getMWSAuthToken() {
    	return mwsAuthToken;
    }
    
    /**
     * Sets the value of the mwsAuthToken property
     * @param authTokenValue
     * 		allowed object is 
     * 		{@link String}
     */
    public void setMWSAuthToken(String authTokenValue) {
    	this.mwsAuthToken = authTokenValue;
    }

    public boolean isSetMWSAuthToken() {
    	return (this.mwsAuthToken!=null);
    }

    /**
     * Gets the value of the purgeAndReplace property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPurgeAndReplace() {
        return purgeAndReplace;
    }

    /**
     * Sets the value of the purgeAndReplace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPurgeAndReplace(Boolean value) {
        this.purgeAndReplace = value;
    }

    public boolean isSetPurgeAndReplace() {
        return (this.purgeAndReplace!= null);
    }

    /**
     * Sets the value of the Marketplace property.
     * 
     * @deprecated  See {@link #setMarketplace(String)}
     * @param value
     * @return
     *     this instance
     */
    public SubmitFeedRequest withMarketplace(String value) {
        setMarketplace(value);
        return this;
    }

    /**
     * Sets the value of the Merchant property.
     * 
     * @param value
     * @return
     *     this instance
     */
    public SubmitFeedRequest withMerchant(String value) {
        setMerchant(value);
        return this;
    }
    
    /**
     * Sets the value of the MWSAuthToken property.
     * 
     * @param value
     * @return
     *     this instance
     */
    public SubmitFeedRequest withMWSAuthToken(String value) {
        setMWSAuthToken(value);
        return this;
    }

    /**
     * Sets the value of the FeedContent property.
     * 
     * @param value
     * @return
     *     this instance
     */
    public SubmitFeedRequest withFeedContent(InputStream value) {
        setFeedContent(value);
        return this;
    }

    public SubmitFeedRequest withContentMD5(String value) {
        setContentMD5(value);
        return this;
    }

    /**
     * Sets the value of the FeedType property.
     * 
     * @param value
     * @return
     *     this instance
     */
    public SubmitFeedRequest withFeedType(String value) {
        setFeedType(value);
        return this;
    }

    /**
     * Sets the value of the PurgeAndReplace property.
     * 
     * @param value
     * @return
     *     this instance
     */
    public SubmitFeedRequest withPurgeAndReplace(Boolean value) {
        setPurgeAndReplace(value);
        return this;
    }

    public SubmitFeedRequest withFeedOptions(String feedOptions) {
        setFeedOptions(feedOptions);
        return this;
    }


    /**
     *
     * JSON fragment representation of this object
     *
     * @return JSON fragment for this object. Name for outer
     * object expected to be set by calling method. This fragment
     * returns inner properties representation only
     *
     */
    protected String toJSONFragment() {
        StringBuffer json = new StringBuffer();
        boolean first = true;
        if (isSetMarketplace()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("Marketplace"));
            json.append(" : ");
            json.append(quoteJSON(getMarketplace()));
            first = false;
        }
        if (isSetMerchant()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("Merchant"));
            json.append(" : ");
            json.append(quoteJSON(getMerchant()));
            first = false;
        }
        if (isSetFeedContent()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("FeedContent"));
            json.append(" : ");
            json.append(quoteJSON(getFeedContent().toString()));
            first = false;
        }
        if (isSetFeedType()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("FeedType"));
            json.append(" : ");
            json.append(quoteJSON(getFeedType()));
            first = false;
        }
        if (isSetPurgeAndReplace()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("PurgeAndReplace"));
            json.append(" : ");
            json.append(quoteJSON(isPurgeAndReplace() + ""));
            first = false;
        }
        if (isSetMWSAuthToken()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("MWSAuthToken"));
            json.append(" : ");
            json.append(quoteJSON(getMWSAuthToken()));
            first = false;
        }
        if (isSetFeedOptions()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("FeedOptions"));
            json.append(" : ");
            json.append(quoteJSON(getFeedOptions()));
            first = false;
        }
        return json.toString();
    }

    /**
     *
     * Quote JSON string
     */
    private String quoteJSON(String string) {
        StringBuffer sb = new StringBuffer();
        sb.append("\"");
        int length = string.length();
        for (int i = 0; i < length; ++i) {
            char c = string.charAt(i);
            switch (c) {
            case '"':
                sb.append("\\\"");
                break;
            case '\\':
                sb.append("\\\\");
                break;
            case '/':
                sb.append("\\/");
                break;
            case '\b':
                sb.append("\\b");
                break;
            case '\f':
                sb.append("\\f");
                break;
            case '\n':
                sb.append("\\n");
                break;
            case '\r':
                sb.append("\\r");
                break;
            case '\t':
                sb.append("\\t");
                break;
            default:
                if (c <  ' ') {
                    sb.append("\\u" + String.format("%03x", Integer.valueOf(c)));
                } else {
                sb.append(c);
            }
        }
        }
        sb.append("\"");
        return sb.toString();
    }


}
