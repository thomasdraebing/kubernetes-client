
package io.fabric8.kubernetes.api.model.gatewayapi.v1alpha2;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.builder.Editable;
import io.fabric8.kubernetes.api.model.Container;
import io.fabric8.kubernetes.api.model.IntOrString;
import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.fabric8.kubernetes.api.model.LabelSelector;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaim;
import io.fabric8.kubernetes.api.model.PodTemplateSpec;
import io.fabric8.kubernetes.api.model.ResourceRequirements;
import io.fabric8.kubernetes.api.model.gatewayapi.v1beta1.HTTPHeaderFilter;
import io.fabric8.kubernetes.api.model.gatewayapi.v1beta1.HTTPRequestMirrorFilter;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.BuildableReference;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "apiVersion",
    "kind",
    "metadata",
    "extensionRef",
    "requestHeaderModifier",
    "requestMirror",
    "responseHeaderModifier",
    "type"
})
@ToString
@EqualsAndHashCode
@Setter
@Accessors(prefix = {
    "_",
    ""
})
@Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, lazyCollectionInitEnabled = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
    @BuildableReference(ObjectMeta.class),
    @BuildableReference(LabelSelector.class),
    @BuildableReference(Container.class),
    @BuildableReference(PodTemplateSpec.class),
    @BuildableReference(ResourceRequirements.class),
    @BuildableReference(IntOrString.class),
    @BuildableReference(ObjectReference.class),
    @BuildableReference(io.fabric8.kubernetes.api.model.LocalObjectReference.class),
    @BuildableReference(PersistentVolumeClaim.class)
})
@Generated("jsonschema2pojo")
public class GRPCRouteFilter implements Editable<GRPCRouteFilterBuilder> , KubernetesResource
{

    @JsonProperty("extensionRef")
    private io.fabric8.kubernetes.api.model.gatewayapi.v1beta1.LocalObjectReference extensionRef;
    @JsonProperty("requestHeaderModifier")
    private HTTPHeaderFilter requestHeaderModifier;
    @JsonProperty("requestMirror")
    private HTTPRequestMirrorFilter requestMirror;
    @JsonProperty("responseHeaderModifier")
    private HTTPHeaderFilter responseHeaderModifier;
    @JsonProperty("type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public GRPCRouteFilter() {
    }

    public GRPCRouteFilter(io.fabric8.kubernetes.api.model.gatewayapi.v1beta1.LocalObjectReference extensionRef, HTTPHeaderFilter requestHeaderModifier, HTTPRequestMirrorFilter requestMirror, HTTPHeaderFilter responseHeaderModifier, String type) {
        super();
        this.extensionRef = extensionRef;
        this.requestHeaderModifier = requestHeaderModifier;
        this.requestMirror = requestMirror;
        this.responseHeaderModifier = responseHeaderModifier;
        this.type = type;
    }

    @JsonProperty("extensionRef")
    public io.fabric8.kubernetes.api.model.gatewayapi.v1beta1.LocalObjectReference getExtensionRef() {
        return extensionRef;
    }

    @JsonProperty("extensionRef")
    public void setExtensionRef(io.fabric8.kubernetes.api.model.gatewayapi.v1beta1.LocalObjectReference extensionRef) {
        this.extensionRef = extensionRef;
    }

    @JsonProperty("requestHeaderModifier")
    public HTTPHeaderFilter getRequestHeaderModifier() {
        return requestHeaderModifier;
    }

    @JsonProperty("requestHeaderModifier")
    public void setRequestHeaderModifier(HTTPHeaderFilter requestHeaderModifier) {
        this.requestHeaderModifier = requestHeaderModifier;
    }

    @JsonProperty("requestMirror")
    public HTTPRequestMirrorFilter getRequestMirror() {
        return requestMirror;
    }

    @JsonProperty("requestMirror")
    public void setRequestMirror(HTTPRequestMirrorFilter requestMirror) {
        this.requestMirror = requestMirror;
    }

    @JsonProperty("responseHeaderModifier")
    public HTTPHeaderFilter getResponseHeaderModifier() {
        return responseHeaderModifier;
    }

    @JsonProperty("responseHeaderModifier")
    public void setResponseHeaderModifier(HTTPHeaderFilter responseHeaderModifier) {
        this.responseHeaderModifier = responseHeaderModifier;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonIgnore
    public GRPCRouteFilterBuilder edit() {
        return new GRPCRouteFilterBuilder(this);
    }

    @JsonIgnore
    public GRPCRouteFilterBuilder toBuilder() {
        return edit();
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
