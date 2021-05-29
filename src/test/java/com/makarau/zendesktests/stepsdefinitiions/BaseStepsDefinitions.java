package com.makarau.zendesktests.stepsdefinitiions;

import com.makarau.zendesktests.steps.*;
import net.thucydides.core.annotations.Steps;

public abstract class BaseStepsDefinitions {

    @Steps
    BaseSteps baseSteps;
    @Steps
    LoginSteps loginSteps;
    @Steps
    DashboardSteps dashboardSteps;
    @Steps
    LeadWizardSteps leadWizardSteps;
    @Steps
    LeadTableSteps leadTableSteps;
    @Steps
    RestAPISteps restAPISteps;

    public enum LeadStatus {
        NEW("New"),
        WORKING("Working"),
        UNQUALIFIED("Unqualified");

        public final String value;
        public String getValue() {
            return this.value;
        }
        LeadStatus(String value) {
            this.value = value;
        }
    }
}
