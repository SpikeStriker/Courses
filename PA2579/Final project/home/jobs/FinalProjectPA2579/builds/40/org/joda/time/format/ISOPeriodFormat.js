var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":206,"id":18678,"methods":[{"el":53,"sc":5,"sl":51},{"el":86,"sc":5,"sl":64},{"el":113,"sc":5,"sl":96},{"el":144,"sc":5,"sl":123},{"el":172,"sc":5,"sl":154},{"el":204,"sc":5,"sl":182}],"name":"ISOPeriodFormat","sl":33}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1099":{"methods":[{"sl":64}],"name":"testToStandardSeconds","pass":true,"statements":[{"sl":65},{"sl":85}]},"test_1123":{"methods":[{"sl":64}],"name":"testNormalizedStandard_periodType_yearMonth3","pass":true,"statements":[{"sl":65},{"sl":85}]},"test_1129":{"methods":[{"sl":64}],"name":"testConstructor_Object1","pass":true,"statements":[{"sl":65},{"sl":85}]},"test_1253":{"methods":[{"sl":64}],"name":"testFactory_parseMonths_String","pass":true,"statements":[{"sl":65},{"sl":85}]},"test_1278":{"methods":[{"sl":64}],"name":"testConstructor_Object1","pass":true,"statements":[{"sl":65},{"sl":85}]},"test_1334":{"methods":[{"sl":64}],"name":"testParse_noFormatter","pass":true,"statements":[{"sl":65},{"sl":85}]},"test_1414":{"methods":[{"sl":64}],"name":"testNormalizedStandard_periodType_years","pass":true,"statements":[{"sl":65},{"sl":85}]},"test_1556":{"methods":[{"sl":64}],"name":"testParseWithOffset_noOffsetInString","pass":true,"statements":[{"sl":65},{"sl":85}]},"test_156":{"methods":[{"sl":64}],"name":"testConstructor_Object_PeriodType1","pass":true,"statements":[{"sl":65},{"sl":85}]},"test_1574":{"methods":[{"sl":64}],"name":"testParse_noFormatter","pass":true,"statements":[{"sl":65},{"sl":85}]},"test_1715":{"methods":[{"sl":64}],"name":"testParse_noOffsetInString","pass":true,"statements":[{"sl":65},{"sl":85}]},"test_1840":{"methods":[{"sl":64}],"name":"testMutablePeriod","pass":true,"statements":[{"sl":65},{"sl":85}]},"test_2025":{"methods":[{"sl":64}],"name":"testFactory_standardPeriodIn_RPeriod","pass":true,"statements":[{"sl":65},{"sl":85}]},"test_2146":{"methods":[{"sl":64}],"name":"testToStandardWeeks_months","pass":true,"statements":[{"sl":65},{"sl":85}]},"test_2201":{"methods":[{"sl":64}],"name":"testConstructor_Object1","pass":true,"statements":[{"sl":65},{"sl":85}]},"test_2219":{"methods":[{"sl":64}],"name":"testFactory_standardMinutesIn_RPeriod","pass":true,"statements":[{"sl":65},{"sl":85}]},"test_2338":{"methods":[{"sl":64}],"name":"testToStandardHours","pass":true,"statements":[{"sl":65},{"sl":85}]},"test_2359":{"methods":[{"sl":64}],"name":"testFactory_standardDaysIn_RPeriod","pass":true,"statements":[{"sl":65},{"sl":85}]},"test_2377":{"methods":[{"sl":64}],"name":"testToString","pass":true,"statements":[{"sl":65},{"sl":85}]},"test_2405":{"methods":[{"sl":64}],"name":"testFactory_standardHoursIn_RPeriod","pass":true,"statements":[{"sl":65},{"sl":85}]},"test_2434":{"methods":[{"sl":64}],"name":"testParse_offsetInString","pass":true,"statements":[{"sl":65},{"sl":85}]},"test_2591":{"methods":[{"sl":64}],"name":"testConstructor_Object1","pass":true,"statements":[{"sl":65},{"sl":85}]},"test_2862":{"methods":[{"sl":64}],"name":"testParseWithOffset_invalid","pass":true,"statements":[{"sl":65},{"sl":85}]},"test_333":{"methods":[{"sl":64}],"name":"testToStandardMinutes","pass":true,"statements":[{"sl":65},{"sl":66},{"sl":85}]},"test_353":{"methods":[{"sl":64}],"name":"testToStandardDays","pass":true,"statements":[{"sl":65},{"sl":85}]},"test_408":{"methods":[{"sl":64}],"name":"testMinus","pass":true,"statements":[{"sl":65},{"sl":85}]},"test_501":{"methods":[{"sl":64}],"name":"testToString","pass":true,"statements":[{"sl":65},{"sl":85}]},"test_570":{"methods":[{"sl":64}],"name":"testToString_nullPeriodFormatter","pass":true,"statements":[{"sl":65},{"sl":85}]},"test_589":{"methods":[{"sl":64}],"name":"testToString_reparse","pass":true,"statements":[{"sl":65},{"sl":85}]},"test_610":{"methods":[{"sl":64}],"name":"testPeriod","pass":true,"statements":[{"sl":65},{"sl":85}]},"test_644":{"methods":[{"sl":64}],"name":"testConstructor_Object_PeriodType1","pass":true,"statements":[{"sl":65},{"sl":85}]},"test_690":{"methods":[{"sl":64}],"name":"testFactory_standardWeeksIn_RPeriod","pass":true,"statements":[{"sl":65},{"sl":85}]},"test_700":{"methods":[{"sl":64}],"name":"testParseWithOffset_offsetInString","pass":true,"statements":[{"sl":65},{"sl":85}]},"test_73":{"methods":[{"sl":64}],"name":"testFactory_standardSecondsIn_RPeriod","pass":true,"statements":[{"sl":65},{"sl":85}]},"test_796":{"methods":[{"sl":64}],"name":"testParse_noFormatter","pass":true,"statements":[{"sl":65},{"sl":85}]},"test_798":{"methods":[{"sl":64}],"name":"testPeriod","pass":true,"statements":[{"sl":65},{"sl":85}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [570, 2219, 796, 2201, 156, 1129, 353, 700, 1556, 1253, 1099, 2359, 1715, 644, 1574, 1123, 333, 2405, 2338, 1840, 690, 1334, 2862, 1278, 2591, 2025, 589, 2377, 610, 408, 798, 501, 2146, 73, 1414, 2434], [570, 2219, 796, 2201, 156, 1129, 353, 700, 1556, 1253, 1099, 2359, 1715, 644, 1574, 1123, 333, 2405, 2338, 1840, 690, 1334, 2862, 1278, 2591, 2025, 589, 2377, 610, 408, 798, 501, 2146, 73, 1414, 2434], [333], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [570, 2219, 796, 2201, 156, 1129, 353, 700, 1556, 1253, 1099, 2359, 1715, 644, 1574, 1123, 333, 2405, 2338, 1840, 690, 1334, 2862, 1278, 2591, 2025, 589, 2377, 610, 408, 798, 501, 2146, 73, 1414, 2434], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
