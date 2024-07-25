var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":107,"id":14773,"methods":[{"el":55,"sc":5,"sl":53},{"el":76,"sc":5,"sl":64},{"el":85,"sc":5,"sl":79},{"el":97,"sc":5,"sl":87},{"el":101,"sc":5,"sl":99},{"el":105,"sc":5,"sl":103}],"name":"SkipDateTimeField","sl":35}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1003":{"methods":[{"sl":79}],"name":"testToDateTimeAtStartOfDay_nullZone","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_1016":{"methods":[{"sl":79}],"name":"testPlusDays_int","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_102":{"methods":[{"sl":79}],"name":"testMinusWeeks_int","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_1039":{"methods":[{"sl":79}],"name":"testMinusYears_int","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_1053":{"methods":[{"sl":79},{"sl":87},{"sl":99}],"name":"testToInterval","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84},{"sl":88},{"sl":89},{"sl":96},{"sl":100}]},"test_1066":{"methods":[{"sl":79}],"name":"testToInterval_Zone","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_1073":{"methods":[{"sl":79}],"name":"testEqualsHashCodeStrict","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_1075":{"methods":[{"sl":79}],"name":"testMinusWeeks_int","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_1097":{"methods":[{"sl":79}],"name":"testPropertyEqualsHashCodeLenient","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_1117":{"methods":[{"sl":99}],"name":"testToDateMidnight_nullZone","pass":true,"statements":[{"sl":100}]},"test_1131":{"methods":[{"sl":79}],"name":"testPlusMonths_int","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_1136":{"methods":[{"sl":79},{"sl":87},{"sl":99}],"name":"testToInterval_nullZone","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84},{"sl":88},{"sl":89},{"sl":96},{"sl":100}]},"test_1156":{"methods":[{"sl":79}],"name":"testToDateMidnight_Zone","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_1170":{"methods":[{"sl":79}],"name":"testPlusMinutes_int","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_1186":{"methods":[{"sl":99}],"name":"testToDateTime_RI","pass":true,"statements":[{"sl":100}]},"test_1290":{"methods":[{"sl":79}],"name":"testToDateTimeAtMidnight_Zone","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_1291":{"methods":[{"sl":79}],"name":"testMinus_RP","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_1325":{"methods":[{"sl":79},{"sl":87},{"sl":99}],"name":"testToDateTimeAtCurrentTime","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84},{"sl":88},{"sl":89},{"sl":96},{"sl":100}]},"test_1360":{"methods":[{"sl":79},{"sl":99}],"name":"testEqualsHashCode","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84},{"sl":100}]},"test_1399":{"methods":[{"sl":99}],"name":"testWithChronologyRetainFields_invalidInNewChrono","pass":true,"statements":[{"sl":100}]},"test_1416":{"methods":[{"sl":79},{"sl":87}],"name":"testGJCutover","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84},{"sl":88},{"sl":89},{"sl":96}]},"test_1429":{"methods":[{"sl":79}],"name":"testToDate_summer","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_1452":{"methods":[{"sl":87}],"name":"testJulianYearZero","pass":true,"statements":[{"sl":88},{"sl":89},{"sl":90},{"sl":91}]},"test_149":{"methods":[{"sl":79}],"name":"testMinusDays_int","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_1494":{"methods":[{"sl":79}],"name":"testEqualsHashCodeLenient","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_1495":{"methods":[{"sl":79}],"name":"testToDateTime_Zone","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_154":{"methods":[{"sl":79}],"name":"testMinusMonths_int","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_1600":{"methods":[{"sl":79}],"name":"testToDateTime_LocalTime","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_1608":{"methods":[{"sl":79}],"name":"testPlus_RP","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_1619":{"methods":[{"sl":79}],"name":"testConstructor_ObjectLocalDate","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_163":{"methods":[{"sl":99}],"name":"testWithChronologyRetainFields_Chrono","pass":true,"statements":[{"sl":100}]},"test_164":{"methods":[{"sl":99}],"name":"testToDateTimeAtMidnight_nullZone","pass":true,"statements":[{"sl":100}]},"test_1642":{"methods":[{"sl":79}],"name":"testMinus_RP","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_1643":{"methods":[{"sl":79}],"name":"testGetField","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_1687":{"methods":[{"sl":99}],"name":"testWithChronologyRetainFields_nullChrono","pass":true,"statements":[{"sl":100}]},"test_1735":{"methods":[{"sl":79}],"name":"testMinusYears_int","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_1740":{"methods":[{"sl":79}],"name":"testMinusMillis_int","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_1751":{"methods":[{"sl":79}],"name":"testWithDurationAdded_RP_int","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_1779":{"methods":[{"sl":79}],"name":"testToInterval_nullZone","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_1796":{"methods":[{"sl":79}],"name":"testWithers","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":82},{"sl":84}]},"test_180":{"methods":[{"sl":64},{"sl":87}],"name":"testSkipDateTimeField","pass":true,"statements":[{"sl":65},{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":75},{"sl":88},{"sl":89},{"sl":90},{"sl":91}]},"test_1800":{"methods":[{"sl":79}],"name":"testPlusHours_int","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_1830":{"methods":[{"sl":79}],"name":"testGetFieldTypes","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_1834":{"methods":[{"sl":79}],"name":"testPlusHours_int","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_1843":{"methods":[{"sl":79}],"name":"testGetFieldType","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_185":{"methods":[{"sl":79}],"name":"testToDateTime_LocalTime_Zone","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_1853":{"methods":[{"sl":79}],"name":"testToDateTime_LocalTime_nullZone","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_1877":{"methods":[{"sl":79}],"name":"testPlusDays_int","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_1891":{"methods":[{"sl":99}],"name":"testToLocalDate","pass":true,"statements":[{"sl":100}]},"test_1893":{"methods":[{"sl":53},{"sl":64}],"name":"testToString","pass":true,"statements":[{"sl":54},{"sl":65},{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":75}]},"test_19":{"methods":[{"sl":53},{"sl":64}],"name":"testSerialization","pass":true,"statements":[{"sl":54},{"sl":65},{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":75}]},"test_195":{"methods":[{"sl":79}],"name":"testWithers","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":82},{"sl":84}]},"test_1962":{"methods":[{"sl":99}],"name":"testToDateTime_RI","pass":true,"statements":[{"sl":100}]},"test_1989":{"methods":[{"sl":79}],"name":"testIsSupported","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_20":{"methods":[{"sl":53},{"sl":64},{"sl":99}],"name":"testSerialization","pass":true,"statements":[{"sl":54},{"sl":65},{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":75},{"sl":100}]},"test_2035":{"methods":[{"sl":79}],"name":"testMinusMonths_int","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_2039":{"methods":[{"sl":79}],"name":"testPlusWeeks_int","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_2044":{"methods":[{"sl":79}],"name":"testGetFields","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_2048":{"methods":[{"sl":79}],"name":"testMinusMillis_int","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_2061":{"methods":[{"sl":79}],"name":"testPlus_RP","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_2062":{"methods":[{"sl":79}],"name":"testPlusMonths_int","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_2064":{"methods":[{"sl":79},{"sl":87},{"sl":99}],"name":"testToDateTimeAtCurrentTime_nullZone","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84},{"sl":88},{"sl":89},{"sl":96},{"sl":100}]},"test_2065":{"methods":[{"sl":99}],"name":"testPropertyEquals","pass":true,"statements":[{"sl":100}]},"test_2066":{"methods":[{"sl":79}],"name":"testMinusMinutes_int","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_2068":{"methods":[{"sl":79}],"name":"testMinusSeconds_int","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_2094":{"methods":[{"sl":79}],"name":"testPlusWeeks_int","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_2100":{"methods":[{"sl":99}],"name":"testEqualsHashCode","pass":true,"statements":[{"sl":100}]},"test_2111":{"methods":[{"sl":79}],"name":"testMinusDays_int","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_213":{"methods":[{"sl":79}],"name":"testMinusWeeks_int","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_2175":{"methods":[{"sl":53},{"sl":64}],"name":"testSerializedCopticChronology","pass":true,"statements":[{"sl":54},{"sl":65},{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":75}]},"test_2177":{"methods":[{"sl":53},{"sl":64},{"sl":79}],"name":"testSerializedGJChronology","pass":true,"statements":[{"sl":54},{"sl":65},{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":75},{"sl":80},{"sl":81},{"sl":84}]},"test_2200":{"methods":[{"sl":53},{"sl":64},{"sl":79}],"name":"testSerialization","pass":true,"statements":[{"sl":54},{"sl":65},{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":75},{"sl":80},{"sl":81},{"sl":84}]},"test_2242":{"methods":[{"sl":99}],"name":"testToDateMidnight","pass":true,"statements":[{"sl":100}]},"test_2269":{"methods":[{"sl":79},{"sl":87}],"name":"testToDateTimeAtCurrentTime","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84},{"sl":88},{"sl":89},{"sl":96}]},"test_2313":{"methods":[{"sl":79}],"name":"testPlusWeeks_int","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_2323":{"methods":[{"sl":79},{"sl":87},{"sl":99}],"name":"testToDateTime_TOD_Zone","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84},{"sl":88},{"sl":89},{"sl":96},{"sl":100}]},"test_2333":{"methods":[{"sl":79},{"sl":87}],"name":"testToDateTimeAtCurrentTime_Zone","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84},{"sl":88},{"sl":89},{"sl":96}]},"test_2344":{"methods":[{"sl":53},{"sl":64},{"sl":79},{"sl":99}],"name":"testSerializedLocalDateBuddhist","pass":true,"statements":[{"sl":54},{"sl":65},{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":75},{"sl":80},{"sl":81},{"sl":84},{"sl":100}]},"test_2375":{"methods":[{"sl":79}],"name":"testPlusWeeks_int","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_2387":{"methods":[{"sl":79},{"sl":99}],"name":"testEqualsHashCode","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84},{"sl":100}]},"test_2412":{"methods":[{"sl":99}],"name":"testPropertyEquals","pass":true,"statements":[{"sl":100}]},"test_2417":{"methods":[{"sl":79}],"name":"testConstructor_ObjectLocalDate","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_2421":{"methods":[{"sl":53},{"sl":64},{"sl":79}],"name":"testSerialization","pass":true,"statements":[{"sl":54},{"sl":65},{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":75},{"sl":80},{"sl":81},{"sl":84}]},"test_2422":{"methods":[{"sl":99}],"name":"testToInterval","pass":true,"statements":[{"sl":100}]},"test_2432":{"methods":[{"sl":53},{"sl":64}],"name":"testSerialization","pass":true,"statements":[{"sl":54},{"sl":65},{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":75}]},"test_245":{"methods":[{"sl":79}],"name":"testToDateTimeAtMidnight_nullZone","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_2465":{"methods":[{"sl":79}],"name":"testIsSupported","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_2476":{"methods":[{"sl":53},{"sl":64}],"name":"testSerialization","pass":true,"statements":[{"sl":54},{"sl":65},{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":75}]},"test_2503":{"methods":[{"sl":79}],"name":"testWithDurationAdded_RP_int","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_2504":{"methods":[{"sl":79}],"name":"testPlus_RP","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_2509":{"methods":[{"sl":79},{"sl":87},{"sl":99}],"name":"testToDateTime_nullTOD","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84},{"sl":88},{"sl":89},{"sl":96},{"sl":100}]},"test_2517":{"methods":[{"sl":79}],"name":"testToDateTimeAtStartOfDay","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_2527":{"methods":[{"sl":79}],"name":"testToLocalDateTime_LocalTime","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_2565":{"methods":[{"sl":79}],"name":"testToDateTimeAtStartOfDay_Zone","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_2566":{"methods":[{"sl":79}],"name":"testGetFieldType","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_2610":{"methods":[{"sl":79},{"sl":87},{"sl":99}],"name":"testToDateTime_nullTOD_Zone","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84},{"sl":88},{"sl":89},{"sl":96},{"sl":100}]},"test_2619":{"methods":[{"sl":79}],"name":"testToDate_winter","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_2643":{"methods":[{"sl":79}],"name":"testMinus_RP","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_2645":{"methods":[{"sl":79}],"name":"testPlusSeconds_int","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_2668":{"methods":[{"sl":53},{"sl":64},{"sl":79}],"name":"testSerializedGJChronologyChangedInternals","pass":true,"statements":[{"sl":54},{"sl":65},{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":75},{"sl":80},{"sl":81},{"sl":84}]},"test_2683":{"methods":[{"sl":79},{"sl":99}],"name":"testGetIntervalChronology_RInterval","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":82},{"sl":84},{"sl":100}]},"test_2694":{"methods":[{"sl":79}],"name":"testPlusMillis_int","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_27":{"methods":[{"sl":79}],"name":"testWithers","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":82},{"sl":84}]},"test_2700":{"methods":[{"sl":99}],"name":"testToLocalDate","pass":true,"statements":[{"sl":100}]},"test_2717":{"methods":[{"sl":99}],"name":"testIsContiguous_RP_GJChronology","pass":true,"statements":[{"sl":100}]},"test_2725":{"methods":[{"sl":79}],"name":"testMinusDays_int","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_2747":{"methods":[{"sl":79}],"name":"testToDateTime_nullRI","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_2765":{"methods":[{"sl":79}],"name":"testPlus_RP","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_2772":{"methods":[{"sl":99}],"name":"testEqualsHashCode","pass":true,"statements":[{"sl":100}]},"test_2815":{"methods":[{"sl":99}],"name":"testToDateMidnight_Zone","pass":true,"statements":[{"sl":100}]},"test_2823":{"methods":[{"sl":53},{"sl":64}],"name":"testSerializedJulianChronology","pass":true,"statements":[{"sl":54},{"sl":65},{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":75}]},"test_2824":{"methods":[{"sl":79}],"name":"testToDate_winter","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_2837":{"methods":[{"sl":79}],"name":"testConstructor_Object_Chronology_crossChronology","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_2843":{"methods":[{"sl":79}],"name":"testGetFieldTypes","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_2845":{"methods":[{"sl":79}],"name":"testWithers","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":82},{"sl":84}]},"test_2846":{"methods":[{"sl":79}],"name":"testConstructor_ObjectLocalDateTime","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_2854":{"methods":[{"sl":79}],"name":"testMinusHours_int","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_2870":{"methods":[{"sl":79},{"sl":87}],"name":"testToDateTimeAtCurrentTime_nullZone","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84},{"sl":88},{"sl":89},{"sl":96}]},"test_2874":{"methods":[{"sl":53},{"sl":64},{"sl":79},{"sl":99}],"name":"testSerializedBuddhistChronology","pass":true,"statements":[{"sl":54},{"sl":65},{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":75},{"sl":80},{"sl":81},{"sl":84},{"sl":100}]},"test_2891":{"methods":[{"sl":79}],"name":"testMinusYears_int","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_2893":{"methods":[{"sl":79}],"name":"testToDateMidnight_nullZone","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_2895":{"methods":[{"sl":99}],"name":"testWithChronologyRetainFields_invalidInNewChrono","pass":true,"statements":[{"sl":100}]},"test_2899":{"methods":[{"sl":79},{"sl":87}],"name":"testToDateTime_nullLocalTime_Zone","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84},{"sl":88},{"sl":89},{"sl":96}]},"test_2901":{"methods":[{"sl":79}],"name":"testPlusDays_int","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_2903":{"methods":[{"sl":79}],"name":"testToYearMonthDay","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_2909":{"methods":[{"sl":99}],"name":"testToInterval_Zone","pass":true,"statements":[{"sl":100}]},"test_2924":{"methods":[{"sl":99}],"name":"testPropertyEqualsHashCodeStrict","pass":true,"statements":[{"sl":100}]},"test_294":{"methods":[{"sl":99}],"name":"testWithChronologyRetainFields_sameChrono","pass":true,"statements":[{"sl":100}]},"test_2960":{"methods":[{"sl":79}],"name":"testMinusMonths_int","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_2965":{"methods":[{"sl":79}],"name":"testToDateTimeAtMidnight","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_2995":{"methods":[{"sl":79},{"sl":87}],"name":"testToDateTime_RI","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84},{"sl":88},{"sl":89},{"sl":96}]},"test_322":{"methods":[{"sl":79}],"name":"testMinusYears_int","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_324":{"methods":[{"sl":79}],"name":"testMinus_RP","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_327":{"methods":[{"sl":79}],"name":"testGetField","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_344":{"methods":[{"sl":79}],"name":"testPlusYears_int","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_349":{"methods":[{"sl":79}],"name":"testMinusSeconds_int","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_352":{"methods":[{"sl":53},{"sl":64}],"name":"testSerialization","pass":true,"statements":[{"sl":54},{"sl":65},{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":75}]},"test_358":{"methods":[{"sl":79}],"name":"testToDateTime_nullZone","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_39":{"methods":[{"sl":79}],"name":"testConstructor_ObjectLocalDateTime","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_407":{"methods":[{"sl":79}],"name":"testConstructor_ObjectYearMonthDay","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_415":{"methods":[{"sl":79}],"name":"testToDateTime","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_419":{"methods":[{"sl":79}],"name":"testMinusDays_int","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_445":{"methods":[{"sl":99}],"name":"testWithChronologyRetainFields_sameChrono","pass":true,"statements":[{"sl":100}]},"test_467":{"methods":[{"sl":79}],"name":"testPlusMinutes_int","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_475":{"methods":[{"sl":79}],"name":"testToYearMonthDay","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_482":{"methods":[{"sl":99}],"name":"testToDateTimeAtMidnight_Zone","pass":true,"statements":[{"sl":100}]},"test_507":{"methods":[{"sl":99}],"name":"testPropertyEqualsHashCodeLenient","pass":true,"statements":[{"sl":100}]},"test_508":{"methods":[{"sl":79}],"name":"testToDate_summer_Zone","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_511":{"methods":[{"sl":79}],"name":"testToDateMidnight","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_516":{"methods":[{"sl":79}],"name":"testPlusYears_int","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_533":{"methods":[{"sl":53},{"sl":64},{"sl":99}],"name":"testSerialization","pass":true,"statements":[{"sl":54},{"sl":65},{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":75},{"sl":100}]},"test_552":{"methods":[{"sl":79}],"name":"testToDate_summer","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_554":{"methods":[{"sl":99}],"name":"testPropertyEqualsHashCodeStrict","pass":true,"statements":[{"sl":100}]},"test_557":{"methods":[{"sl":79},{"sl":87},{"sl":99}],"name":"testToDateTimeAtCurrentTime_Zone","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84},{"sl":88},{"sl":89},{"sl":96},{"sl":100}]},"test_567":{"methods":[{"sl":79},{"sl":87},{"sl":99}],"name":"testToDateTime_TOD","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84},{"sl":88},{"sl":89},{"sl":96},{"sl":100}]},"test_62":{"methods":[{"sl":79}],"name":"testConstructor_ObjectLocalDateTime","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_622":{"methods":[{"sl":79}],"name":"testEqualsHashCodeAPI","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_63":{"methods":[{"sl":79}],"name":"testMinusMinutes_int","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_636":{"methods":[{"sl":79}],"name":"testMinusHours_int","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_652":{"methods":[{"sl":79},{"sl":87},{"sl":99}],"name":"testToDateTime_TOD_nullZone","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84},{"sl":88},{"sl":89},{"sl":96},{"sl":100}]},"test_653":{"methods":[{"sl":99}],"name":"testPropertyEqualsHashCodeLenient","pass":true,"statements":[{"sl":100}]},"test_655":{"methods":[{"sl":79}],"name":"testPropertyEqualsHashCodeYear","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_692":{"methods":[{"sl":79}],"name":"testPlusMonths_int","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_756":{"methods":[{"sl":79}],"name":"testMinusMonths_int","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_774":{"methods":[{"sl":99}],"name":"testWithChronologyRetainFields_nullChrono","pass":true,"statements":[{"sl":100}]},"test_79":{"methods":[{"sl":99}],"name":"testToInterval_nullZone","pass":true,"statements":[{"sl":100}]},"test_791":{"methods":[{"sl":79}],"name":"testConstructor_Object_Chronology_crossChronology","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_792":{"methods":[{"sl":79}],"name":"testToDate_winter_Zone","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_800":{"methods":[{"sl":79}],"name":"testPlusMillis_int","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_805":{"methods":[{"sl":79}],"name":"testPlusYears_int","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_808":{"methods":[{"sl":79}],"name":"testToInterval","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_814":{"methods":[{"sl":79}],"name":"testPropertyEqualsHashCodeLenient","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_823":{"methods":[{"sl":79}],"name":"testMinusWeeks_int","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_826":{"methods":[{"sl":99}],"name":"testToDateTimeAtMidnight","pass":true,"statements":[{"sl":100}]},"test_827":{"methods":[{"sl":79}],"name":"testGetFields","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_830":{"methods":[{"sl":79}],"name":"testPlusMonths_int","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_86":{"methods":[{"sl":79}],"name":"testPlusSeconds_int","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_881":{"methods":[{"sl":99}],"name":"testWithChronologyRetainFields_Chrono","pass":true,"statements":[{"sl":100}]},"test_885":{"methods":[{"sl":79},{"sl":87},{"sl":99}],"name":"testToInterval_Zone","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84},{"sl":88},{"sl":89},{"sl":96},{"sl":100}]},"test_9":{"methods":[{"sl":79}],"name":"testPlusYears_int","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_90":{"methods":[{"sl":79}],"name":"testToDateTime_RI","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_904":{"methods":[{"sl":79}],"name":"testPropertyEqualsHashCodeLenient","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_922":{"methods":[{"sl":53},{"sl":64}],"name":"testSerialization","pass":true,"statements":[{"sl":54},{"sl":65},{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":75}]},"test_928":{"methods":[{"sl":79}],"name":"testPlusDays_int","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84}]},"test_968":{"methods":[{"sl":79},{"sl":87}],"name":"testToDateTime_nullLocalTime","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":84},{"sl":88},{"sl":89},{"sl":96}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2476, 2432, 2175, 1893, 2177, 2421, 352, 2668, 533, 19, 20, 922, 2344, 2823, 2200, 2874], [2476, 2432, 2175, 1893, 2177, 2421, 352, 2668, 533, 19, 20, 922, 2344, 2823, 2200, 2874], [], [], [], [], [], [], [], [], [], [2476, 2432, 2175, 1893, 2177, 2421, 180, 352, 2668, 533, 19, 20, 922, 2344, 2823, 2200, 2874], [2476, 2432, 2175, 1893, 2177, 2421, 180, 352, 2668, 533, 19, 20, 922, 2344, 2823, 2200, 2874], [2476, 2432, 2175, 1893, 2177, 2421, 180, 352, 2668, 533, 19, 20, 922, 2344, 2823, 2200, 2874], [2476, 2432, 2175, 1893, 2177, 2421, 180, 352, 2668, 533, 19, 20, 922, 2344, 2823, 2200, 2874], [2476, 2432, 2175, 1893, 2177, 2421, 180, 352, 2668, 533, 19, 20, 922, 2344, 2823, 2200, 2874], [2476, 2432, 2175, 1893, 2177, 2421, 180, 352, 2668, 533, 19, 20, 922, 2344, 2823, 2200, 2874], [], [], [], [], [], [2476, 2432, 2175, 1893, 2177, 2421, 180, 352, 2668, 533, 19, 20, 922, 2344, 2823, 2200, 2874], [], [], [], [557, 1735, 2837, 1843, 358, 1800, 407, 1016, 2893, 1495, 1053, 1494, 2509, 2870, 327, 692, 885, 1325, 2111, 928, 2333, 90, 636, 814, 1853, 792, 1290, 1751, 756, 1643, 1619, 1989, 2313, 245, 1642, 791, 1291, 62, 154, 475, 2504, 552, 904, 2965, 2044, 1039, 567, 1779, 516, 2566, 2048, 2417, 823, 2068, 2645, 2846, 2891, 419, 324, 2694, 2610, 322, 2527, 2725, 2062, 2375, 63, 86, 2901, 800, 2177, 415, 2064, 2854, 2269, 467, 1170, 2039, 2824, 39, 1136, 1796, 1834, 652, 2683, 2421, 2323, 1830, 102, 195, 2899, 2643, 2035, 2061, 2765, 1003, 2517, 2387, 2995, 2619, 2747, 1066, 2066, 622, 1600, 1073, 2668, 805, 968, 149, 349, 344, 2344, 1097, 185, 1608, 1075, 2503, 830, 1877, 27, 1156, 2845, 2903, 1131, 2200, 1416, 655, 827, 9, 808, 2874, 1429, 508, 2843, 2960, 213, 511, 1360, 2094, 1740, 2465, 2565], [557, 1735, 2837, 1843, 358, 1800, 407, 1016, 2893, 1495, 1053, 1494, 2509, 2870, 327, 692, 885, 1325, 2111, 928, 2333, 90, 636, 814, 1853, 792, 1290, 1751, 756, 1643, 1619, 1989, 2313, 245, 1642, 791, 1291, 62, 154, 475, 2504, 552, 904, 2965, 2044, 1039, 567, 1779, 516, 2566, 2048, 2417, 823, 2068, 2645, 2846, 2891, 419, 324, 2694, 2610, 322, 2527, 2725, 2062, 2375, 63, 86, 2901, 800, 2177, 415, 2064, 2854, 2269, 467, 1170, 2039, 2824, 39, 1136, 1796, 1834, 652, 2683, 2421, 2323, 1830, 102, 195, 2899, 2643, 2035, 2061, 2765, 1003, 2517, 2387, 2995, 2619, 2747, 1066, 2066, 622, 1600, 1073, 2668, 805, 968, 149, 349, 344, 2344, 1097, 185, 1608, 1075, 2503, 830, 1877, 27, 1156, 2845, 2903, 1131, 2200, 1416, 655, 827, 9, 808, 2874, 1429, 508, 2843, 2960, 213, 511, 1360, 2094, 1740, 2465, 2565], [557, 1735, 2837, 1843, 358, 1800, 407, 1016, 2893, 1495, 1053, 1494, 2509, 2870, 327, 692, 885, 1325, 2111, 928, 2333, 90, 636, 814, 1853, 792, 1290, 1751, 756, 1643, 1619, 1989, 2313, 245, 1642, 791, 1291, 62, 154, 475, 2504, 552, 904, 2965, 2044, 1039, 567, 1779, 516, 2566, 2048, 2417, 823, 2068, 2645, 2846, 2891, 419, 324, 2694, 2610, 322, 2527, 2725, 2062, 2375, 63, 86, 2901, 800, 2177, 415, 2064, 2854, 2269, 467, 1170, 2039, 2824, 39, 1136, 1796, 1834, 652, 2683, 2421, 2323, 1830, 102, 195, 2899, 2643, 2035, 2061, 2765, 1003, 2517, 2387, 2995, 2619, 2747, 1066, 2066, 622, 1600, 1073, 2668, 805, 968, 149, 349, 344, 2344, 1097, 185, 1608, 1075, 2503, 830, 1877, 27, 1156, 2845, 2903, 1131, 2200, 1416, 655, 827, 9, 808, 2874, 1429, 508, 2843, 2960, 213, 511, 1360, 2094, 1740, 2465, 2565], [1796, 2683, 195, 27, 2845], [], [557, 1735, 2837, 1843, 358, 1800, 407, 1016, 2893, 1495, 1053, 1494, 2509, 2870, 327, 692, 885, 1325, 2111, 928, 2333, 90, 636, 814, 1853, 792, 1290, 1751, 756, 1643, 1619, 1989, 2313, 245, 1642, 791, 1291, 62, 154, 475, 2504, 552, 904, 2965, 2044, 1039, 567, 1779, 516, 2566, 2048, 2417, 823, 2068, 2645, 2846, 2891, 419, 324, 2694, 2610, 322, 2527, 2725, 2062, 2375, 63, 86, 2901, 800, 2177, 415, 2064, 2854, 2269, 467, 1170, 2039, 2824, 39, 1136, 1796, 1834, 652, 2683, 2421, 2323, 1830, 102, 195, 2899, 2643, 2035, 2061, 2765, 1003, 2517, 2387, 2995, 2619, 2747, 1066, 2066, 622, 1600, 1073, 2668, 805, 968, 149, 349, 344, 2344, 1097, 185, 1608, 1075, 2503, 830, 1877, 27, 1156, 2845, 2903, 1131, 2200, 1416, 655, 827, 9, 808, 2874, 1429, 508, 2843, 2960, 213, 511, 1360, 2094, 1740, 2465, 2565], [], [], [557, 1053, 2509, 2870, 885, 1325, 2333, 567, 2610, 1452, 2064, 2269, 1136, 652, 2323, 180, 2899, 2995, 968, 1416], [557, 1053, 2509, 2870, 885, 1325, 2333, 567, 2610, 1452, 2064, 2269, 1136, 652, 2323, 180, 2899, 2995, 968, 1416], [557, 1053, 2509, 2870, 885, 1325, 2333, 567, 2610, 1452, 2064, 2269, 1136, 652, 2323, 180, 2899, 2995, 968, 1416], [1452, 180], [1452, 180], [], [], [], [], [557, 1053, 2509, 2870, 885, 1325, 2333, 567, 2610, 2064, 2269, 1136, 652, 2323, 2899, 2995, 968, 1416], [], [], [557, 1053, 2509, 885, 1325, 2909, 1117, 164, 2412, 294, 2772, 445, 1891, 567, 1186, 2895, 1399, 2924, 2610, 507, 2242, 2064, 554, 482, 1687, 1136, 652, 2683, 2323, 2065, 2387, 2422, 2700, 881, 2100, 533, 20, 2344, 2815, 2717, 774, 1962, 163, 2874, 653, 826, 1360, 79], [557, 1053, 2509, 885, 1325, 2909, 1117, 164, 2412, 294, 2772, 445, 1891, 567, 1186, 2895, 1399, 2924, 2610, 507, 2242, 2064, 554, 482, 1687, 1136, 652, 2683, 2323, 2065, 2387, 2422, 2700, 881, 2100, 533, 20, 2344, 2815, 2717, 774, 1962, 163, 2874, 653, 826, 1360, 79], [], [], [], [], [], [], []]
