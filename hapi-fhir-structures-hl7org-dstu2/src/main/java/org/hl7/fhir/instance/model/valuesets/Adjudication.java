package org.hl7.fhir.instance.model.valuesets;

/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/

// Generated on Tue, Jul 21, 2015 10:37-0400 for FHIR v0.5.0


public enum Adjudication {

        /**
         * null
         */
        TOTAL, 
        /**
         * null
         */
        COPAY, 
        /**
         * null
         */
        ELIGIBLE, 
        /**
         * null
         */
        DEDUCTABLE, 
        /**
         * null
         */
        ELIGPERCENT, 
        /**
         * null
         */
        TAX, 
        /**
         * null
         */
        BENEFIT, 
        /**
         * added to help the parsers
         */
        NULL;
        public static Adjudication fromCode(String codeString) throws Exception {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("total".equals(codeString))
          return TOTAL;
        if ("copay".equals(codeString))
          return COPAY;
        if ("eligible".equals(codeString))
          return ELIGIBLE;
        if ("deductable".equals(codeString))
          return DEDUCTABLE;
        if ("eligpercent".equals(codeString))
          return ELIGPERCENT;
        if ("tax".equals(codeString))
          return TAX;
        if ("benefit".equals(codeString))
          return BENEFIT;
        throw new Exception("Unknown Adjudication code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case TOTAL: return "total";
            case COPAY: return "copay";
            case ELIGIBLE: return "eligible";
            case DEDUCTABLE: return "deductable";
            case ELIGPERCENT: return "eligpercent";
            case TAX: return "tax";
            case BENEFIT: return "benefit";
            default: return "?";
          }
        }
        public String getSystem() {
          return "http://hl7.org/fhir/adjudication";
        }
        public String getDefinition() {
          switch (this) {
            case TOTAL: return "";
            case COPAY: return "";
            case ELIGIBLE: return "";
            case DEDUCTABLE: return "";
            case ELIGPERCENT: return "";
            case TAX: return "";
            case BENEFIT: return "";
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case TOTAL: return "total";
            case COPAY: return "copay";
            case ELIGIBLE: return "eligible";
            case DEDUCTABLE: return "deductable";
            case ELIGPERCENT: return "eligpercent";
            case TAX: return "tax";
            case BENEFIT: return "benefit";
            default: return "?";
          }
    }


}

