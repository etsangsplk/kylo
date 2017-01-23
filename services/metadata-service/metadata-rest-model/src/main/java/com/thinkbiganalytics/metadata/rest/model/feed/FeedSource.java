package com.thinkbiganalytics.metadata.rest.model.feed;

import java.io.Serializable;

import org.joda.time.DateTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.joda.ser.DateTimeSerializer;
import com.thinkbiganalytics.metadata.rest.model.data.Datasource;

/**
 *
 * @author Sean Felten
 */
@SuppressWarnings("serial")
@JsonInclude(Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FeedSource implements Serializable {
    
    @JsonSerialize(using=DateTimeSerializer.class)
    private DateTime lastLoadTime;

    private String id;
    private String datasourceId;
    private Datasource datasource;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DateTime getLastLoadTime() {
        return lastLoadTime;
    }

    public void setLastLoadTime(DateTime lastLoadTime) {
        this.lastLoadTime = lastLoadTime;
    }

    public String getDatasourceId() {
        return datasourceId;
    }

    public void setDatasourceId(String datasourceId) {
        this.datasourceId = datasourceId;
    }

    public Datasource getDatasource() {
        return datasource;
    }

    public void setDatasource(Datasource datasource) {
        this.datasource = datasource;
    }
}