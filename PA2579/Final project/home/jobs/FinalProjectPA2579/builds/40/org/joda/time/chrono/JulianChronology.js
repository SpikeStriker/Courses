var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":278,"id":11632,"methods":[{"el":74,"sc":5,"sl":72},{"el":85,"sc":5,"sl":76},{"el":95,"sc":5,"sl":93},{"el":104,"sc":5,"sl":102},{"el":114,"sc":5,"sl":112},{"el":158,"sc":5,"sl":123},{"el":168,"sc":5,"sl":166},{"el":180,"sc":5,"sl":173},{"el":191,"sc":5,"sl":189},{"el":207,"sc":5,"sl":199},{"el":213,"sc":5,"sl":209},{"el":217,"sc":5,"sl":215},{"el":243,"sc":5,"sl":219},{"el":247,"sc":5,"sl":245},{"el":251,"sc":5,"sl":249},{"el":255,"sc":5,"sl":253},{"el":259,"sc":5,"sl":257},{"el":263,"sc":5,"sl":261},{"el":267,"sc":5,"sl":265},{"el":276,"sc":5,"sl":269}],"name":"JulianChronology","sl":49}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_0":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testMinusMonths_int","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_1005":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testPlusMinutes_int","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_1027":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":219},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testMinusHours_int","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":224},{"sl":225},{"sl":226},{"sl":229},{"sl":238},{"sl":242},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_1028":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testPlusSeconds_int","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_1066":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testPlusYears_int","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_113":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testWithers","pass":true,"statements":[{"sl":77},{"sl":78},{"sl":82},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_1149":{"methods":[{"sl":93},{"sl":102},{"sl":123},{"sl":189}],"name":"testConstructor_int_int_int_Chronology","pass":true,"statements":[{"sl":94},{"sl":103},{"sl":124},{"sl":127},{"sl":128},{"sl":129},{"sl":136},{"sl":137},{"sl":142},{"sl":157},{"sl":190}]},"test_1158":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testConstructor_ObjectLocalDateTime","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_1167":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":219},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testGJCutover","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":224},{"sl":225},{"sl":226},{"sl":229},{"sl":238},{"sl":242},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_1191":{"methods":[{"sl":93},{"sl":102},{"sl":123},{"sl":189}],"name":"testConstructor_long1_Chronology","pass":true,"statements":[{"sl":94},{"sl":103},{"sl":124},{"sl":127},{"sl":128},{"sl":129},{"sl":136},{"sl":137},{"sl":142},{"sl":157},{"sl":190}]},"test_1221":{"methods":[{"sl":245}],"name":"testIsContiguous_RP_GJChronology","pass":true,"statements":[{"sl":246}]},"test_1269":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testPlusYears_int","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_1330":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testMinusMonths_int","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_1371":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testPlusSeconds_int","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_1381":{"methods":[{"sl":123},{"sl":173},{"sl":215},{"sl":245},{"sl":249},{"sl":253},{"sl":257},{"sl":261},{"sl":265},{"sl":269}],"name":"testSerializedGJChronology","pass":true,"statements":[{"sl":124},{"sl":127},{"sl":128},{"sl":129},{"sl":136},{"sl":137},{"sl":142},{"sl":157},{"sl":174},{"sl":175},{"sl":176},{"sl":177},{"sl":216},{"sl":246},{"sl":250},{"sl":254},{"sl":258},{"sl":262},{"sl":266},{"sl":270},{"sl":271},{"sl":273},{"sl":274}]},"test_1391":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testMinusHours_int","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_1410":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testPlusDays_int","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_1447":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testPlusMonths_int","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_1456":{"methods":[{"sl":76},{"sl":93},{"sl":209},{"sl":215},{"sl":219},{"sl":245},{"sl":249}],"name":"test_julianDay","pass":true,"statements":[{"sl":77},{"sl":78},{"sl":82},{"sl":84},{"sl":94},{"sl":212},{"sl":216},{"sl":224},{"sl":225},{"sl":226},{"sl":229},{"sl":238},{"sl":242},{"sl":246},{"sl":250}]},"test_1509":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testWithDurationAdded_RP_int","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_153":{"methods":[{"sl":93},{"sl":102},{"sl":123},{"sl":189}],"name":"testConstructor_Object_Chronology","pass":true,"statements":[{"sl":94},{"sl":103},{"sl":124},{"sl":127},{"sl":128},{"sl":129},{"sl":136},{"sl":137},{"sl":142},{"sl":157},{"sl":190}]},"test_1550":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testMinus_RP","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_1672":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testPlus_RP","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_1768":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testMinusSeconds_int","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_182":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":219},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testConstructor_Object_Chronology_crossChronology","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":224},{"sl":225},{"sl":226},{"sl":229},{"sl":238},{"sl":242},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_1822":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testPlus_RP","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_1824":{"methods":[{"sl":189}],"name":"testConstructor_long2_Chronology","pass":true,"statements":[{"sl":190}]},"test_1869":{"methods":[{"sl":93},{"sl":102},{"sl":123},{"sl":189}],"name":"testConstructor_long2_Chronology","pass":true,"statements":[{"sl":94},{"sl":103},{"sl":124},{"sl":127},{"sl":128},{"sl":129},{"sl":136},{"sl":137},{"sl":142},{"sl":157},{"sl":190}]},"test_1880":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testToDateTime_RI","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_1920":{"methods":[{"sl":93},{"sl":102},{"sl":123},{"sl":189}],"name":"testConstructor_nullObject_Chronology","pass":true,"statements":[{"sl":94},{"sl":103},{"sl":124},{"sl":127},{"sl":128},{"sl":129},{"sl":136},{"sl":137},{"sl":142},{"sl":157},{"sl":190}]},"test_1942":{"methods":[{"sl":93},{"sl":249}],"name":"testJulianYearZero","pass":true,"statements":[{"sl":94},{"sl":250}]},"test_1958":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testPlusDays_int","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_1967":{"methods":[{"sl":123},{"sl":173},{"sl":215},{"sl":245},{"sl":249},{"sl":253},{"sl":257},{"sl":261},{"sl":265},{"sl":269}],"name":"testSerializedLocalDateBuddhist","pass":true,"statements":[{"sl":124},{"sl":127},{"sl":128},{"sl":129},{"sl":136},{"sl":137},{"sl":142},{"sl":157},{"sl":174},{"sl":175},{"sl":176},{"sl":177},{"sl":216},{"sl":246},{"sl":250},{"sl":254},{"sl":258},{"sl":262},{"sl":266},{"sl":270},{"sl":271},{"sl":273},{"sl":274}]},"test_1977":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testPlusWeeks_int","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_203":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testPlusDays_int","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_2054":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testMinusDays_int","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_2057":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testMinus_RP","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_206":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testMinus_RP","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_2060":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testPlusYears_int","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_2131":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testMinusYears_int","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_2182":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testMinusDays_int","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_2209":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testWithers","pass":true,"statements":[{"sl":77},{"sl":78},{"sl":82},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_2221":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testPlusHours_int","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_2226":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testPlusMillis_int","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_2256":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testPlusDays_int","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_2348":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testWithers","pass":true,"statements":[{"sl":77},{"sl":78},{"sl":82},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_2365":{"methods":[{"sl":93},{"sl":102},{"sl":123},{"sl":189}],"name":"testConstructor_int_int_Chronology","pass":true,"statements":[{"sl":94},{"sl":103},{"sl":124},{"sl":127},{"sl":128},{"sl":129},{"sl":136},{"sl":137},{"sl":142},{"sl":157},{"sl":190}]},"test_2371":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testMinusWeeks_int","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_2387":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testConstructor_ObjectLocalDateTime","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_240":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testConstructor_ObjectLocalDateTime","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_2415":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testPlusMinutes_int","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_2457":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testMinusMillis_int","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_2462":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testPlusWeeks_int","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_2533":{"methods":[{"sl":189}],"name":"testConstructor_Chronology","pass":true,"statements":[{"sl":190}]},"test_2596":{"methods":[{"sl":93},{"sl":102},{"sl":123},{"sl":189}],"name":"testConstructor_int_int_int_int_Chronology","pass":true,"statements":[{"sl":94},{"sl":103},{"sl":124},{"sl":127},{"sl":128},{"sl":129},{"sl":136},{"sl":137},{"sl":142},{"sl":157},{"sl":190}]},"test_2674":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testPlusWeeks_int","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_2699":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testPlusYears_int","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_2715":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testConstructor_ObjectLocalDate","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_2721":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testMinusWeeks_int","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_2739":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testPlusHours_int","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_2752":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testMinusDays_int","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_283":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testGetIntervalChronology_RInterval","pass":true,"statements":[{"sl":77},{"sl":78},{"sl":82},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_2906":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testConstructor_ObjectLocalDate","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_2927":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testPlusMonths_int","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_2945":{"methods":[{"sl":189}],"name":"testConstructor_int_int_int_int_Chronology","pass":true,"statements":[{"sl":190}]},"test_2954":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testPlusMillis_int","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_314":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testConstructor_Object_Chronology_crossChronology","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_332":{"methods":[{"sl":189}],"name":"testFactoryMillisOfDay_long_Chronology","pass":true,"statements":[{"sl":190}]},"test_341":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testPlusWeeks_int","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_366":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testMinusMonths_int","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_395":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testMinusWeeks_int","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_411":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":219},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testWithers","pass":true,"statements":[{"sl":77},{"sl":78},{"sl":82},{"sl":84},{"sl":212},{"sl":216},{"sl":224},{"sl":225},{"sl":226},{"sl":229},{"sl":238},{"sl":242},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_422":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testPlusMonths_int","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_432":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testMinusMinutes_int","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_486":{"methods":[{"sl":189}],"name":"testConstructor_long1_Chronology","pass":true,"statements":[{"sl":190}]},"test_487":{"methods":[{"sl":112},{"sl":123}],"name":"testToString","pass":true,"statements":[{"sl":113},{"sl":124},{"sl":127},{"sl":128},{"sl":129},{"sl":136},{"sl":137},{"sl":142},{"sl":157}]},"test_494":{"methods":[{"sl":93},{"sl":102},{"sl":123},{"sl":189}],"name":"testFactoryMillisOfDay_long1_Chronology","pass":true,"statements":[{"sl":94},{"sl":103},{"sl":124},{"sl":127},{"sl":128},{"sl":129},{"sl":136},{"sl":137},{"sl":142},{"sl":157},{"sl":190}]},"test_515":{"methods":[{"sl":93},{"sl":102},{"sl":123},{"sl":189}],"name":"testConstructor_Chronology","pass":true,"statements":[{"sl":94},{"sl":103},{"sl":124},{"sl":127},{"sl":128},{"sl":129},{"sl":136},{"sl":137},{"sl":142},{"sl":157},{"sl":190}]},"test_519":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testPlus_RP","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_579":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testMinus_RP","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_584":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testConstructor_ObjectYearMonthDay","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_585":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testMinusMinutes_int","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_662":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testMinusWeeks_int","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_670":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testPlusMonths_int","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_689":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testMinusSeconds_int","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_697":{"methods":[{"sl":112},{"sl":123},{"sl":173},{"sl":245},{"sl":249},{"sl":253},{"sl":261},{"sl":269}],"name":"testSerializedJulianChronology","pass":true,"statements":[{"sl":113},{"sl":124},{"sl":127},{"sl":128},{"sl":129},{"sl":136},{"sl":137},{"sl":142},{"sl":157},{"sl":174},{"sl":175},{"sl":176},{"sl":177},{"sl":246},{"sl":250},{"sl":254},{"sl":262},{"sl":270},{"sl":271},{"sl":273},{"sl":274}]},"test_702":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":219},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testWithDurationAdded_RP_int","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":224},{"sl":225},{"sl":226},{"sl":229},{"sl":238},{"sl":242},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_704":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testMinusYears_int","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_710":{"methods":[{"sl":189}],"name":"testConstructor_Object1_Chronology","pass":true,"statements":[{"sl":190}]},"test_730":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testPlus_RP","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_746":{"methods":[{"sl":189}],"name":"testConstructor_nullObject_Chronology","pass":true,"statements":[{"sl":190}]},"test_770":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testMinusYears_int","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_790":{"methods":[{"sl":123},{"sl":173},{"sl":215},{"sl":245},{"sl":249},{"sl":253},{"sl":257},{"sl":261},{"sl":265},{"sl":269}],"name":"testSerializedBuddhistChronology","pass":true,"statements":[{"sl":124},{"sl":127},{"sl":128},{"sl":129},{"sl":136},{"sl":137},{"sl":142},{"sl":157},{"sl":174},{"sl":175},{"sl":176},{"sl":177},{"sl":216},{"sl":246},{"sl":250},{"sl":254},{"sl":258},{"sl":262},{"sl":266},{"sl":270},{"sl":271},{"sl":273},{"sl":274}]},"test_817":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testMinusMillis_int","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_834":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testMinusDays_int","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_941":{"methods":[{"sl":123},{"sl":166},{"sl":173},{"sl":215},{"sl":219},{"sl":245},{"sl":249},{"sl":253},{"sl":257},{"sl":261},{"sl":265},{"sl":269}],"name":"testSerializedGJChronologyChangedInternals","pass":true,"statements":[{"sl":124},{"sl":127},{"sl":128},{"sl":129},{"sl":136},{"sl":137},{"sl":142},{"sl":143},{"sl":144},{"sl":145},{"sl":146},{"sl":147},{"sl":153},{"sl":157},{"sl":167},{"sl":174},{"sl":175},{"sl":176},{"sl":177},{"sl":216},{"sl":224},{"sl":225},{"sl":226},{"sl":231},{"sl":233},{"sl":234},{"sl":238},{"sl":242},{"sl":246},{"sl":250},{"sl":254},{"sl":258},{"sl":262},{"sl":266},{"sl":270},{"sl":271},{"sl":273},{"sl":274}]},"test_952":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testMinusMonths_int","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]},"test_974":{"methods":[{"sl":76},{"sl":209},{"sl":215},{"sl":245},{"sl":249},{"sl":257},{"sl":265}],"name":"testMinusYears_int","pass":true,"statements":[{"sl":77},{"sl":84},{"sl":212},{"sl":216},{"sl":246},{"sl":250},{"sl":258},{"sl":266}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2462, 1977, 432, 579, 702, 1158, 2256, 1447, 1456, 2674, 2057, 2906, 519, 182, 2131, 2182, 834, 2209, 2954, 1880, 730, 1167, 974, 2371, 704, 770, 689, 662, 2348, 240, 1550, 584, 314, 1958, 2060, 1330, 817, 1005, 0, 206, 1028, 203, 341, 283, 2721, 366, 2221, 952, 1822, 2752, 1066, 2457, 670, 1391, 1410, 113, 585, 395, 1768, 2054, 2387, 1509, 1672, 2415, 2715, 411, 2226, 2699, 1269, 1027, 2927, 422, 2739, 1371], [2462, 1977, 432, 579, 702, 1158, 2256, 1447, 1456, 2674, 2057, 2906, 519, 182, 2131, 2182, 834, 2209, 2954, 1880, 730, 1167, 974, 2371, 704, 770, 689, 662, 2348, 240, 1550, 584, 314, 1958, 2060, 1330, 817, 1005, 0, 206, 1028, 203, 341, 283, 2721, 366, 2221, 952, 1822, 2752, 1066, 2457, 670, 1391, 1410, 113, 585, 395, 1768, 2054, 2387, 1509, 1672, 2415, 2715, 411, 2226, 2699, 1269, 1027, 2927, 422, 2739, 1371], [1456, 2209, 2348, 283, 113, 411], [], [], [], [1456, 2209, 2348, 283, 113, 411], [], [2462, 1977, 432, 579, 702, 1158, 2256, 1447, 1456, 2674, 2057, 2906, 519, 182, 2131, 2182, 834, 2209, 2954, 1880, 730, 1167, 974, 2371, 704, 770, 689, 662, 2348, 240, 1550, 584, 314, 1958, 2060, 1330, 817, 1005, 0, 206, 1028, 203, 341, 283, 2721, 366, 2221, 952, 1822, 2752, 1066, 2457, 670, 1391, 1410, 113, 585, 395, 1768, 2054, 2387, 1509, 1672, 2415, 2715, 411, 2226, 2699, 1269, 1027, 2927, 422, 2739, 1371], [], [], [], [], [], [], [], [], [1456, 515, 2365, 1191, 1869, 1149, 153, 494, 1942, 2596, 1920], [1456, 515, 2365, 1191, 1869, 1149, 153, 494, 1942, 2596, 1920], [], [], [], [], [], [], [], [515, 2365, 1191, 1869, 1149, 153, 494, 2596, 1920], [515, 2365, 1191, 1869, 1149, 153, 494, 2596, 1920], [], [], [], [], [], [], [], [], [487, 697], [487, 697], [], [], [], [], [], [], [], [], [], [487, 515, 1967, 2365, 1191, 941, 1869, 1381, 1149, 153, 494, 2596, 790, 697, 1920], [487, 515, 1967, 2365, 1191, 941, 1869, 1381, 1149, 153, 494, 2596, 790, 697, 1920], [], [], [487, 515, 1967, 2365, 1191, 941, 1869, 1381, 1149, 153, 494, 2596, 790, 697, 1920], [487, 515, 1967, 2365, 1191, 941, 1869, 1381, 1149, 153, 494, 2596, 790, 697, 1920], [487, 515, 1967, 2365, 1191, 941, 1869, 1381, 1149, 153, 494, 2596, 790, 697, 1920], [], [], [], [], [], [], [487, 515, 1967, 2365, 1191, 941, 1869, 1381, 1149, 153, 494, 2596, 790, 697, 1920], [487, 515, 1967, 2365, 1191, 941, 1869, 1381, 1149, 153, 494, 2596, 790, 697, 1920], [], [], [], [], [487, 515, 1967, 2365, 1191, 941, 1869, 1381, 1149, 153, 494, 2596, 790, 697, 1920], [941], [941], [941], [941], [941], [], [], [], [], [], [941], [], [], [], [487, 515, 1967, 2365, 1191, 941, 1869, 1381, 1149, 153, 494, 2596, 790, 697, 1920], [], [], [], [], [], [], [], [], [941], [941], [], [], [], [], [], [1967, 941, 1381, 790, 697], [1967, 941, 1381, 790, 697], [1967, 941, 1381, 790, 697], [1967, 941, 1381, 790, 697], [1967, 941, 1381, 790, 697], [], [], [], [], [], [], [], [], [], [], [], [515, 2365, 486, 1191, 710, 1869, 1824, 2533, 2945, 1149, 153, 494, 746, 2596, 1920, 332], [515, 2365, 486, 1191, 710, 1869, 1824, 2533, 2945, 1149, 153, 494, 746, 2596, 1920, 332], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2462, 1977, 432, 579, 702, 1158, 2256, 1447, 1456, 2674, 2057, 2906, 519, 182, 2131, 2182, 834, 2209, 2954, 1880, 730, 1167, 974, 2371, 704, 770, 689, 662, 2348, 240, 1550, 584, 314, 1958, 2060, 1330, 817, 1005, 0, 206, 1028, 203, 341, 283, 2721, 366, 2221, 952, 1822, 2752, 1066, 2457, 670, 1391, 1410, 113, 585, 395, 1768, 2054, 2387, 1509, 1672, 2415, 2715, 411, 2226, 2699, 1269, 1027, 2927, 422, 2739, 1371], [], [], [2462, 1977, 432, 579, 702, 1158, 2256, 1447, 1456, 2674, 2057, 2906, 519, 182, 2131, 2182, 834, 2209, 2954, 1880, 730, 1167, 974, 2371, 704, 770, 689, 662, 2348, 240, 1550, 584, 314, 1958, 2060, 1330, 817, 1005, 0, 206, 1028, 203, 341, 283, 2721, 366, 2221, 952, 1822, 2752, 1066, 2457, 670, 1391, 1410, 113, 585, 395, 1768, 2054, 2387, 1509, 1672, 2415, 2715, 411, 2226, 2699, 1269, 1027, 2927, 422, 2739, 1371], [], [], [2462, 1977, 432, 579, 702, 1158, 2256, 1447, 1456, 2674, 1967, 2057, 2906, 519, 182, 2131, 2182, 834, 2209, 2954, 1880, 730, 1167, 974, 2371, 704, 770, 689, 662, 941, 2348, 240, 1550, 584, 314, 1958, 2060, 1330, 817, 1381, 1005, 0, 206, 1028, 203, 341, 283, 2721, 366, 2221, 952, 1822, 2752, 1066, 2457, 670, 1391, 1410, 113, 585, 395, 1768, 2054, 2387, 1509, 1672, 2415, 2715, 411, 2226, 790, 2699, 1269, 1027, 2927, 422, 2739, 1371], [2462, 1977, 432, 579, 702, 1158, 2256, 1447, 1456, 2674, 1967, 2057, 2906, 519, 182, 2131, 2182, 834, 2209, 2954, 1880, 730, 1167, 974, 2371, 704, 770, 689, 662, 941, 2348, 240, 1550, 584, 314, 1958, 2060, 1330, 817, 1381, 1005, 0, 206, 1028, 203, 341, 283, 2721, 366, 2221, 952, 1822, 2752, 1066, 2457, 670, 1391, 1410, 113, 585, 395, 1768, 2054, 2387, 1509, 1672, 2415, 2715, 411, 2226, 790, 2699, 1269, 1027, 2927, 422, 2739, 1371], [], [], [702, 1456, 182, 1167, 941, 411, 1027], [], [], [], [], [702, 1456, 182, 1167, 941, 411, 1027], [702, 1456, 182, 1167, 941, 411, 1027], [702, 1456, 182, 1167, 941, 411, 1027], [], [], [702, 1456, 182, 1167, 411, 1027], [], [941], [], [941], [941], [], [], [], [702, 1456, 182, 1167, 941, 411, 1027], [], [], [], [702, 1456, 182, 1167, 941, 411, 1027], [], [], [2462, 1977, 432, 579, 702, 1158, 2256, 1447, 1456, 2674, 1967, 2057, 2906, 519, 182, 2131, 2182, 834, 2209, 2954, 1880, 730, 1167, 974, 2371, 704, 770, 689, 662, 941, 2348, 240, 1221, 1550, 584, 314, 1958, 2060, 1330, 817, 1381, 1005, 0, 206, 1028, 203, 341, 283, 2721, 366, 2221, 952, 1822, 2752, 1066, 2457, 670, 1391, 1410, 113, 585, 395, 1768, 2054, 2387, 1509, 1672, 2415, 2715, 411, 2226, 790, 697, 2699, 1269, 1027, 2927, 422, 2739, 1371], [2462, 1977, 432, 579, 702, 1158, 2256, 1447, 1456, 2674, 1967, 2057, 2906, 519, 182, 2131, 2182, 834, 2209, 2954, 1880, 730, 1167, 974, 2371, 704, 770, 689, 662, 941, 2348, 240, 1221, 1550, 584, 314, 1958, 2060, 1330, 817, 1381, 1005, 0, 206, 1028, 203, 341, 283, 2721, 366, 2221, 952, 1822, 2752, 1066, 2457, 670, 1391, 1410, 113, 585, 395, 1768, 2054, 2387, 1509, 1672, 2415, 2715, 411, 2226, 790, 697, 2699, 1269, 1027, 2927, 422, 2739, 1371], [], [], [2462, 1977, 432, 579, 702, 1158, 2256, 1447, 1456, 2674, 1967, 2057, 2906, 519, 182, 2131, 2182, 834, 2209, 2954, 1880, 730, 1167, 974, 2371, 704, 770, 689, 662, 941, 2348, 240, 1550, 584, 314, 1958, 2060, 1330, 817, 1381, 1005, 0, 206, 1028, 203, 341, 283, 2721, 366, 2221, 952, 1822, 2752, 1066, 2457, 670, 1391, 1410, 113, 585, 395, 1768, 2054, 2387, 1942, 1509, 1672, 2415, 2715, 411, 2226, 790, 697, 2699, 1269, 1027, 2927, 422, 2739, 1371], [2462, 1977, 432, 579, 702, 1158, 2256, 1447, 1456, 2674, 1967, 2057, 2906, 519, 182, 2131, 2182, 834, 2209, 2954, 1880, 730, 1167, 974, 2371, 704, 770, 689, 662, 941, 2348, 240, 1550, 584, 314, 1958, 2060, 1330, 817, 1381, 1005, 0, 206, 1028, 203, 341, 283, 2721, 366, 2221, 952, 1822, 2752, 1066, 2457, 670, 1391, 1410, 113, 585, 395, 1768, 2054, 2387, 1942, 1509, 1672, 2415, 2715, 411, 2226, 790, 697, 2699, 1269, 1027, 2927, 422, 2739, 1371], [], [], [1967, 941, 1381, 790, 697], [1967, 941, 1381, 790, 697], [], [], [2462, 1977, 432, 579, 702, 1158, 2256, 1447, 2674, 1967, 2057, 2906, 519, 182, 2131, 2182, 834, 2209, 2954, 1880, 730, 1167, 974, 2371, 704, 770, 689, 662, 941, 2348, 240, 1550, 584, 314, 1958, 2060, 1330, 817, 1381, 1005, 0, 206, 1028, 203, 341, 283, 2721, 366, 2221, 952, 1822, 2752, 1066, 2457, 670, 1391, 1410, 113, 585, 395, 1768, 2054, 2387, 1509, 1672, 2415, 2715, 411, 2226, 790, 2699, 1269, 1027, 2927, 422, 2739, 1371], [2462, 1977, 432, 579, 702, 1158, 2256, 1447, 2674, 1967, 2057, 2906, 519, 182, 2131, 2182, 834, 2209, 2954, 1880, 730, 1167, 974, 2371, 704, 770, 689, 662, 941, 2348, 240, 1550, 584, 314, 1958, 2060, 1330, 817, 1381, 1005, 0, 206, 1028, 203, 341, 283, 2721, 366, 2221, 952, 1822, 2752, 1066, 2457, 670, 1391, 1410, 113, 585, 395, 1768, 2054, 2387, 1509, 1672, 2415, 2715, 411, 2226, 790, 2699, 1269, 1027, 2927, 422, 2739, 1371], [], [], [1967, 941, 1381, 790, 697], [1967, 941, 1381, 790, 697], [], [], [2462, 1977, 432, 579, 702, 1158, 2256, 1447, 2674, 1967, 2057, 2906, 519, 182, 2131, 2182, 834, 2209, 2954, 1880, 730, 1167, 974, 2371, 704, 770, 689, 662, 941, 2348, 240, 1550, 584, 314, 1958, 2060, 1330, 817, 1381, 1005, 0, 206, 1028, 203, 341, 283, 2721, 366, 2221, 952, 1822, 2752, 1066, 2457, 670, 1391, 1410, 113, 585, 395, 1768, 2054, 2387, 1509, 1672, 2415, 2715, 411, 2226, 790, 2699, 1269, 1027, 2927, 422, 2739, 1371], [2462, 1977, 432, 579, 702, 1158, 2256, 1447, 2674, 1967, 2057, 2906, 519, 182, 2131, 2182, 834, 2209, 2954, 1880, 730, 1167, 974, 2371, 704, 770, 689, 662, 941, 2348, 240, 1550, 584, 314, 1958, 2060, 1330, 817, 1381, 1005, 0, 206, 1028, 203, 341, 283, 2721, 366, 2221, 952, 1822, 2752, 1066, 2457, 670, 1391, 1410, 113, 585, 395, 1768, 2054, 2387, 1509, 1672, 2415, 2715, 411, 2226, 790, 2699, 1269, 1027, 2927, 422, 2739, 1371], [], [], [1967, 941, 1381, 790, 697], [1967, 941, 1381, 790, 697], [1967, 941, 1381, 790, 697], [], [1967, 941, 1381, 790, 697], [1967, 941, 1381, 790, 697], [], [], [], []]
