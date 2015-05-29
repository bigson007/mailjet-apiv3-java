
package com.mailjet.api.model.v3.aggregategraphstatistics;

import com.mailjet.api.client.model.MailJetResourceFilter;


/**
 * Class representing filter for  "aggregategraphstatistics" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
public final class aggregateGraphStatisticsFilter<DataType >
    extends MailJetResourceFilter<aggregateGraphStatistics, DataType>
{

    /**
     * 
     * 
     */
    public final static aggregateGraphStatisticsFilter<Short> CAMPAIGNAGGREGATEID = new aggregateGraphStatisticsFilter<Short>("CampaignAggregateID", Short.class);
    /**
     * 
     * 
     */
    public final static aggregateGraphStatisticsFilter<String> RANGE = new aggregateGraphStatisticsFilter<String>("Range", String.class);

    private aggregateGraphStatisticsFilter(String name, Class<?> type) {
        super(name, type);
    }

}
