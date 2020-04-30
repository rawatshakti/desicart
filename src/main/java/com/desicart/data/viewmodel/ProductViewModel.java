package com.desicart.data.viewmodel;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.HashMap;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductViewModel
{

    public String id;
    public String handle;
    public String title;
    public String bodyHTML;
    public String vendor;
    public String type;
    public String tags;
    public String published;
    public String option1Name;
    public String option1Value;
    public String option2Name;
    public String option2Value;
    public String option3Name;
    public String option3Value;
    public String variantSKU;
    public String variantGrams;
    public String variantInventoryTracker;
    public String variantInventoryQty;
    public String variantInventoryPolicy;
    public String variantFulfillmentService;
    public String variantPrice;
    public String variantCompareAtPrice;
    public String variantRequiresShipping;
    public String variantTaxable;
    public String variantBarcode;
    public String imageSrc;
    public String imagePosition;
    public String imageAltText;
    public String giftCard;
    public String sEOTitle;
    public String sEODescription;
    public String googleShoppingGoogleProductCategory;
    public String googleShoppingGender;
    public String googleShoppingAgeGroup;
    public String googleShoppingMPN;
    public String googleShoppingAdWordsGrouping;
    public String googleShoppingAdWordsLabels;
    public String googleShoppingCondition;
    public String googleShoppingCustomProduct;
    public String googleShoppingCustomLabel0;
    public String googleShoppingCustomLabel1;
    public String googleShoppingCustomLabel2;
    public String googleShoppingCustomLabel3;
    public String googleShoppingCustomLabel4;
    public String variantImage;
    public String variantWeightUnit;
    public String variantTaxCode;
    public String costPerItem;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public ProductViewModel() {
    }

    /**
     *
     * @param variantInventoryQty
     * @param costPerItem
     * @param googleShoppingGender
     * @param imageSrc
     * @param title
     * @param type
     * @param variantInventoryPolicy
     * @param googleShoppingMPN
     * @param variantWeightUnit
     * @param option1Name
     * @param googleShoppingAdWordsGrouping
     * @param vendor
     * @param googleShoppingAgeGroup
     * @param variantBarcode
     * @param variantPrice
     * @param id
     * @param option3Value
     * @param option2Name
     * @param variantSKU
     * @param imageAltText
     * @param variantCompareAtPrice
     * @param googleShoppingCustomProduct
     * @param imagePosition
     * @param variantTaxable
     * @param variantGrams
     * @param handle
     * @param variantTaxCode
     * @param published
     * @param option3Name
     * @param variantFulfillmentService
     * @param option2Value
     * @param sEOTitle
     * @param googleShoppingCustomLabel0
     * @param tags
     * @param googleShoppingCustomLabel1
     * @param variantImage
     * @param googleShoppingCustomLabel2
     * @param option1Value
     * @param variantRequiresShipping
     * @param googleShoppingCustomLabel3
     * @param googleShoppingCustomLabel4
     * @param googleShoppingAdWordsLabels
     * @param googleShoppingCondition
     * @param variantInventoryTracker
     * @param giftCard
     * @param googleShoppingGoogleProductCategory
     * @param bodyHTML
     * @param sEODescription
     */
    public ProductViewModel(String id, String handle, String title, String bodyHTML, String vendor, String type, String tags, String published, String option1Name, String option1Value, String option2Name, String option2Value, String option3Name, String option3Value, String variantSKU, String variantGrams, String variantInventoryTracker, String variantInventoryQty, String variantInventoryPolicy, String variantFulfillmentService, String variantPrice, String variantCompareAtPrice, String variantRequiresShipping, String variantTaxable, String variantBarcode, String imageSrc, String imagePosition, String imageAltText, String giftCard, String sEOTitle, String sEODescription, String googleShoppingGoogleProductCategory, String googleShoppingGender, String googleShoppingAgeGroup, String googleShoppingMPN, String googleShoppingAdWordsGrouping, String googleShoppingAdWordsLabels, String googleShoppingCondition, String googleShoppingCustomProduct, String googleShoppingCustomLabel0, String googleShoppingCustomLabel1, String googleShoppingCustomLabel2, String googleShoppingCustomLabel3, String googleShoppingCustomLabel4, String variantImage, String variantWeightUnit, String variantTaxCode, String costPerItem) {
        super();
        this.id = id;
        this.handle = handle;
        this.title = title;
        this.bodyHTML = bodyHTML;
        this.vendor = vendor;
        this.type = type;
        this.tags = tags;
        this.published = published;
        this.option1Name = option1Name;
        this.option1Value = option1Value;
        this.option2Name = option2Name;
        this.option2Value = option2Value;
        this.option3Name = option3Name;
        this.option3Value = option3Value;
        this.variantSKU = variantSKU;
        this.variantGrams = variantGrams;
        this.variantInventoryTracker = variantInventoryTracker;
        this.variantInventoryQty = variantInventoryQty;
        this.variantInventoryPolicy = variantInventoryPolicy;
        this.variantFulfillmentService = variantFulfillmentService;
        this.variantPrice = variantPrice;
        this.variantCompareAtPrice = variantCompareAtPrice;
        this.variantRequiresShipping = variantRequiresShipping;
        this.variantTaxable = variantTaxable;
        this.variantBarcode = variantBarcode;
        this.imageSrc = imageSrc;
        this.imagePosition = imagePosition;
        this.imageAltText = imageAltText;
        this.giftCard = giftCard;
        this.sEOTitle = sEOTitle;
        this.sEODescription = sEODescription;
        this.googleShoppingGoogleProductCategory = googleShoppingGoogleProductCategory;
        this.googleShoppingGender = googleShoppingGender;
        this.googleShoppingAgeGroup = googleShoppingAgeGroup;
        this.googleShoppingMPN = googleShoppingMPN;
        this.googleShoppingAdWordsGrouping = googleShoppingAdWordsGrouping;
        this.googleShoppingAdWordsLabels = googleShoppingAdWordsLabels;
        this.googleShoppingCondition = googleShoppingCondition;
        this.googleShoppingCustomProduct = googleShoppingCustomProduct;
        this.googleShoppingCustomLabel0 = googleShoppingCustomLabel0;
        this.googleShoppingCustomLabel1 = googleShoppingCustomLabel1;
        this.googleShoppingCustomLabel2 = googleShoppingCustomLabel2;
        this.googleShoppingCustomLabel3 = googleShoppingCustomLabel3;
        this.googleShoppingCustomLabel4 = googleShoppingCustomLabel4;
        this.variantImage = variantImage;
        this.variantWeightUnit = variantWeightUnit;
        this.variantTaxCode = variantTaxCode;
        this.costPerItem = costPerItem;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("handle", handle).append("title", title).append("bodyHTML", bodyHTML).append("vendor", vendor).append("type", type).append("tags", tags).append("published", published).append("option1Name", option1Name).append("option1Value", option1Value).append("option2Name", option2Name).append("option2Value", option2Value).append("option3Name", option3Name).append("option3Value", option3Value).append("variantSKU", variantSKU).append("variantGrams", variantGrams).append("variantInventoryTracker", variantInventoryTracker).append("variantInventoryQty", variantInventoryQty).append("variantInventoryPolicy", variantInventoryPolicy).append("variantFulfillmentService", variantFulfillmentService).append("variantPrice", variantPrice).append("variantCompareAtPrice", variantCompareAtPrice).append("variantRequiresShipping", variantRequiresShipping).append("variantTaxable", variantTaxable).append("variantBarcode", variantBarcode).append("imageSrc", imageSrc).append("imagePosition", imagePosition).append("imageAltText", imageAltText).append("giftCard", giftCard).append("sEOTitle", sEOTitle).append("sEODescription", sEODescription).append("googleShoppingGoogleProductCategory", googleShoppingGoogleProductCategory).append("googleShoppingGender", googleShoppingGender).append("googleShoppingAgeGroup", googleShoppingAgeGroup).append("googleShoppingMPN", googleShoppingMPN).append("googleShoppingAdWordsGrouping", googleShoppingAdWordsGrouping).append("googleShoppingAdWordsLabels", googleShoppingAdWordsLabels).append("googleShoppingCondition", googleShoppingCondition).append("googleShoppingCustomProduct", googleShoppingCustomProduct).append("googleShoppingCustomLabel0", googleShoppingCustomLabel0).append("googleShoppingCustomLabel1", googleShoppingCustomLabel1).append("googleShoppingCustomLabel2", googleShoppingCustomLabel2).append("googleShoppingCustomLabel3", googleShoppingCustomLabel3).append("googleShoppingCustomLabel4", googleShoppingCustomLabel4).append("variantImage", variantImage).append("variantWeightUnit", variantWeightUnit).append("variantTaxCode", variantTaxCode).append("costPerItem", costPerItem).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(variantInventoryQty).append(costPerItem).append(googleShoppingGender).append(type).append(variantInventoryPolicy).append(googleShoppingMPN).append(option1Name).append(googleShoppingAgeGroup).append(id).append(option2Name).append(variantSKU).append(imageAltText).append(variantCompareAtPrice).append(imagePosition).append(variantTaxable).append(handle).append(variantTaxCode).append(published).append(option3Name).append(variantFulfillmentService).append(option2Value).append(sEOTitle).append(googleShoppingCustomLabel0).append(tags).append(googleShoppingCustomLabel1).append(googleShoppingCustomLabel2).append(googleShoppingCustomLabel3).append(googleShoppingCustomLabel4).append(googleShoppingAdWordsLabels).append(googleShoppingCondition).append(variantInventoryTracker).append(googleShoppingGoogleProductCategory).append(bodyHTML).append(additionalProperties).append(sEODescription).append(imageSrc).append(title).append(variantWeightUnit).append(googleShoppingAdWordsGrouping).append(vendor).append(variantBarcode).append(variantPrice).append(option3Value).append(googleShoppingCustomProduct).append(variantGrams).append(variantImage).append(option1Value).append(variantRequiresShipping).append(giftCard).toHashCode();
    }



}