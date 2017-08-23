package org.hl7.fhir.r4.utils.transform.deserializer;

  /** 
   Concept mapping operators.
  */
  public enum FhirMapConceptMapOperators
  {
	/** 
	 Unset value
	*/
	NotSet(0),

	/** 
	 '<='
	*/
	LessThanOrEqual(1),

	/** 
	 '='
	*/
	Equal(2),

	/** 
	 '=='
	*/
	DoubleEqual(3),

	/** 
	 '!='
	*/
	NotEqual(4),

	/** 
	 '>='
	*/
	GreaterThanOrEqual(5),

	/** 
	 '>-'
	*/
	GreaterThanMinus(6),

	/** 
	 '<-'
	*/
	LessThanMinus(7),

	/** 
	 '~'
	*/
	Tilde(8);

	  public static final int SIZE = java.lang.Integer.SIZE;

	  private int intValue;
	  private static java.util.HashMap<Integer, FhirMapConceptMapOperators> mappings;
	  private static java.util.HashMap<Integer, FhirMapConceptMapOperators> getMappings()
	  {
		  if (mappings == null)
		  {
			  synchronized (FhirMapConceptMapOperators.class)
			  {
				  if (mappings == null)
				  {
					  mappings = new java.util.HashMap<Integer, FhirMapConceptMapOperators>();
				  }
			  }
		  }
		  return mappings;
	  }

	  private FhirMapConceptMapOperators(int value)
	  {
		  intValue = value;
		  getMappings().put(value, this);
	  }

	  public int getValue()
	  {
		  return intValue;
	  }

	  public static FhirMapConceptMapOperators forValue(int value)
	  {
		  return getMappings().get(value);
	  }
  }
