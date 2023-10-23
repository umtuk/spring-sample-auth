package org.umtuk.sample.auth.domain;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

public abstract class BaseDocument extends BaseDateDocument {

    @CreatedBy
    protected String createdBy;
    @LastModifiedBy
    protected String lastModifiedBy;
}
