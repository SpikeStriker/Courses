var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":89,"id":2337,"methods":[{"el":54,"sc":5,"sl":52},{"el":64,"sc":5,"sl":62},{"el":70,"sc":5,"sl":66},{"el":87,"sc":5,"sl":79}],"name":"IllegalInstantException","sl":41}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1077":{"methods":[{"sl":62},{"sl":66}],"name":"test_DateTime_withHourZero_Gaza","pass":true,"statements":[{"sl":63},{"sl":67},{"sl":68},{"sl":69}]},"test_1102":{"methods":[{"sl":52}],"name":"test_DateTime_parse_Gaza","pass":true,"statements":[{"sl":53}]},"test_1315":{"methods":[{"sl":62},{"sl":66}],"name":"testIsLocalDateTimeGap_NewYork","pass":true,"statements":[{"sl":63},{"sl":67},{"sl":68},{"sl":69}]},"test_1329":{"methods":[{"sl":62},{"sl":66},{"sl":79}],"name":"testPropertyWithMinimumValueMillisOfDayDSTGap","pass":true,"statements":[{"sl":63},{"sl":67},{"sl":68},{"sl":69},{"sl":80},{"sl":81},{"sl":83},{"sl":84}]},"test_1465":{"methods":[{"sl":62},{"sl":66},{"sl":79}],"name":"testPropertyWithMaximumValueMillisOfDayDSTGap","pass":true,"statements":[{"sl":63},{"sl":67},{"sl":68},{"sl":69},{"sl":80},{"sl":81},{"sl":83},{"sl":84}]},"test_1474":{"methods":[{"sl":62},{"sl":66}],"name":"testToDateTime_Zone_dstGap","pass":true,"statements":[{"sl":63},{"sl":67},{"sl":68},{"sl":69}]},"test_1663":{"methods":[{"sl":62},{"sl":66}],"name":"test_DateTime_withHourZero_Turk","pass":true,"statements":[{"sl":63},{"sl":67},{"sl":68},{"sl":69}]},"test_1741":{"methods":[{"sl":62},{"sl":66}],"name":"test_DateTime_setHourBack_NewYork_Spring","pass":true,"statements":[{"sl":63},{"sl":67},{"sl":68},{"sl":69}]},"test_1805":{"methods":[{"sl":62},{"sl":66}],"name":"test_DateTime_setHourBack_Moscow_Spring","pass":true,"statements":[{"sl":63},{"sl":67},{"sl":68},{"sl":69}]},"test_1813":{"methods":[{"sl":62},{"sl":66}],"name":"test_DateTime_setHourForward_Moscow_Spring","pass":true,"statements":[{"sl":63},{"sl":67},{"sl":68},{"sl":69}]},"test_2246":{"methods":[{"sl":62},{"sl":66}],"name":"test_DateTime_setHourZero_Turk","pass":true,"statements":[{"sl":63},{"sl":67},{"sl":68},{"sl":69}]},"test_2395":{"methods":[{"sl":62},{"sl":66}],"name":"test_LocalDate_toDateMidnight_Turk","pass":true,"statements":[{"sl":63},{"sl":67},{"sl":68},{"sl":69}]},"test_2461":{"methods":[{"sl":62},{"sl":66}],"name":"testIsLocalDateTimeGap_Berlin","pass":true,"statements":[{"sl":63},{"sl":67},{"sl":68},{"sl":69}]},"test_2523":{"methods":[{"sl":62},{"sl":66}],"name":"test_DateTime_new_Turk","pass":true,"statements":[{"sl":63},{"sl":67},{"sl":68},{"sl":69}]},"test_2552":{"methods":[{"sl":62},{"sl":66}],"name":"testZoneTransition","pass":true,"statements":[{"sl":63},{"sl":67},{"sl":68},{"sl":69}]},"test_2897":{"methods":[{"sl":62},{"sl":66}],"name":"test_DateTime_new_Gaza","pass":true,"statements":[{"sl":63},{"sl":67},{"sl":68},{"sl":69}]},"test_325":{"methods":[{"sl":62},{"sl":66}],"name":"test_DateTime_setHourZero_Gaza","pass":true,"statements":[{"sl":63},{"sl":67},{"sl":68},{"sl":69}]},"test_342":{"methods":[{"sl":62},{"sl":66}],"name":"test_DateTime_setHourForward_NewYork_Spring","pass":true,"statements":[{"sl":63},{"sl":67},{"sl":68},{"sl":69}]},"test_385":{"methods":[{"sl":62},{"sl":66}],"name":"testToDateTime_LocalTime_Zone_dstGap","pass":true,"statements":[{"sl":63},{"sl":67},{"sl":68},{"sl":69}]},"test_530":{"methods":[{"sl":52}],"name":"test_DateTime_parse_Turk","pass":true,"statements":[{"sl":53}]},"test_797":{"methods":[{"sl":62},{"sl":66}],"name":"test_LocalDate_toDateMidnight_Gaza","pass":true,"statements":[{"sl":63},{"sl":67},{"sl":68},{"sl":69}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [530, 1102], [530, 1102], [], [], [], [], [], [], [], [], [2523, 1663, 797, 1329, 1474, 1805, 1741, 385, 1315, 342, 325, 1077, 2246, 2395, 2552, 1465, 1813, 2461, 2897], [2523, 1663, 797, 1329, 1474, 1805, 1741, 385, 1315, 342, 325, 1077, 2246, 2395, 2552, 1465, 1813, 2461, 2897], [], [], [2523, 1663, 797, 1329, 1474, 1805, 1741, 385, 1315, 342, 325, 1077, 2246, 2395, 2552, 1465, 1813, 2461, 2897], [2523, 1663, 797, 1329, 1474, 1805, 1741, 385, 1315, 342, 325, 1077, 2246, 2395, 2552, 1465, 1813, 2461, 2897], [2523, 1663, 797, 1329, 1474, 1805, 1741, 385, 1315, 342, 325, 1077, 2246, 2395, 2552, 1465, 1813, 2461, 2897], [2523, 1663, 797, 1329, 1474, 1805, 1741, 385, 1315, 342, 325, 1077, 2246, 2395, 2552, 1465, 1813, 2461, 2897], [], [], [], [], [], [], [], [], [], [1329, 1465], [1329, 1465], [1329, 1465], [], [1329, 1465], [1329, 1465], [], [], [], [], []]
