package org.kdrvcu.site.components.samplecomponent;

import io.kestros.cms.foundation.content.BaseComponent;
import io.kestros.commons.structuredslingmodels.annotation.KestrosModel;
import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

@KestrosModel(validationService = SampleComponentValidationService.class)
@Model(adaptables = Resource.class,
       resourceType = "site/components/content/sample-component")
public class SampleComponent extends BaseComponent {

  public String getSampleProperty() {
    return getProperty("sampleProperty", StringUtils.EMPTY);
  }
}