package org.springframework.social.foursquare.api.impl.json;

import java.util.List;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.social.foursquare.api.Tip;

@JsonIgnoreProperties(ignoreUnknown=true)
abstract class TipGroupMixin {
	@JsonCreator
	TipGroupMixin(
			@JsonProperty("type") String type,
			@JsonProperty("name") String name,
			@JsonProperty("count") int count,
			@JsonProperty("items") List<Tip> items){}
}
