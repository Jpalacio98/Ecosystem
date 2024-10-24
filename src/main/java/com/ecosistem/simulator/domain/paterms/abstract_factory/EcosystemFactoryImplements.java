package com.ecosistem.simulator.domain.paterms.abstract_factory;

import com.ecosistem.simulator.domain.paterms.abstract_factory.implementations.AquaticEcosystemFactory;
import com.ecosistem.simulator.domain.paterms.abstract_factory.implementations.TerrestrialEcosystemFactory;

public class EcosystemFactoryImplements {
    public static EcosystemFactory CreateEcosystem(String type) {
        switch(type){
            case "Aquatic": return new AquaticEcosystemFactory();
            default: return new TerrestrialEcosystemFactory();
        }
    }
}
