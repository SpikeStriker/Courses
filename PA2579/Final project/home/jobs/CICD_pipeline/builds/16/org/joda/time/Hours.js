var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":490,"id":2084,"methods":[{"el":108,"sc":5,"sl":81},{"el":123,"sc":5,"sl":120},{"el":146,"sc":5,"sl":137},{"el":162,"sc":5,"sl":156},{"el":187,"sc":5,"sl":184},{"el":207,"sc":5,"sl":200},{"el":219,"sc":5,"sl":217},{"el":228,"sc":5,"sl":226},{"el":238,"sc":5,"sl":236},{"el":247,"sc":5,"sl":245},{"el":265,"sc":5,"sl":263},{"el":281,"sc":5,"sl":279},{"el":297,"sc":5,"sl":295},{"el":314,"sc":5,"sl":312},{"el":333,"sc":5,"sl":330},{"el":343,"sc":5,"sl":341},{"el":360,"sc":5,"sl":355},{"el":376,"sc":5,"sl":371},{"el":390,"sc":5,"sl":388},{"el":406,"sc":5,"sl":401},{"el":420,"sc":5,"sl":418},{"el":437,"sc":5,"sl":432},{"el":448,"sc":5,"sl":446},{"el":462,"sc":5,"sl":457},{"el":475,"sc":5,"sl":470},{"el":488,"sc":5,"sl":485}],"name":"Hours","sl":42}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_10":{"methods":[{"sl":81},{"sl":217},{"sl":341},{"sl":355},{"sl":388}],"name":"testMinus_int","pass":true,"statements":[{"sl":82},{"sl":87},{"sl":88},{"sl":105},{"sl":106},{"sl":218},{"sl":342},{"sl":356},{"sl":357},{"sl":359},{"sl":389}]},"test_1022":{"methods":[{"sl":81},{"sl":226}],"name":"testSerialization","pass":true,"statements":[{"sl":82},{"sl":97},{"sl":98},{"sl":227}]},"test_1053":{"methods":[{"sl":81},{"sl":217},{"sl":279}],"name":"testToStandardDays","pass":true,"statements":[{"sl":82},{"sl":105},{"sl":106},{"sl":218},{"sl":280}]},"test_108":{"methods":[{"sl":81},{"sl":245}],"name":"testEqualsHashCode","pass":true,"statements":[{"sl":82},{"sl":87},{"sl":88},{"sl":246}]},"test_1093":{"methods":[{"sl":81},{"sl":217},{"sl":330}],"name":"testToStandardDuration","pass":true,"statements":[{"sl":82},{"sl":105},{"sl":106},{"sl":218},{"sl":331},{"sl":332}]},"test_119":{"methods":[{"sl":81},{"sl":217},{"sl":245}],"name":"testToStandardHours","pass":true,"statements":[{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":86},{"sl":87},{"sl":88},{"sl":105},{"sl":106},{"sl":218},{"sl":246}]},"test_1223":{"methods":[{"sl":81},{"sl":217},{"sl":341}],"name":"testGetMethods","pass":true,"statements":[{"sl":82},{"sl":105},{"sl":106},{"sl":218},{"sl":342}]},"test_1345":{"methods":[{"sl":81},{"sl":217},{"sl":341},{"sl":432}],"name":"testDividedBy_int","pass":true,"statements":[{"sl":82},{"sl":87},{"sl":88},{"sl":89},{"sl":90},{"sl":91},{"sl":92},{"sl":95},{"sl":96},{"sl":105},{"sl":106},{"sl":218},{"sl":342},{"sl":433},{"sl":434},{"sl":436}]},"test_1350":{"methods":[{"sl":81},{"sl":217},{"sl":341}],"name":"testToStandardHours","pass":true,"statements":[{"sl":82},{"sl":85},{"sl":86},{"sl":93},{"sl":94},{"sl":101},{"sl":102},{"sl":105},{"sl":106},{"sl":218},{"sl":342}]},"test_1356":{"methods":[{"sl":81},{"sl":341}],"name":"testToStandardHours_months","pass":true,"statements":[{"sl":82},{"sl":83},{"sl":84},{"sl":342}]},"test_1406":{"methods":[{"sl":81},{"sl":295}],"name":"testToStandardMinutes","pass":true,"statements":[{"sl":82},{"sl":89},{"sl":90},{"sl":296}]},"test_1562":{"methods":[{"sl":81},{"sl":184},{"sl":217},{"sl":341}],"name":"testFactory_standardHoursIn_RPeriod","pass":true,"statements":[{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":86},{"sl":87},{"sl":88},{"sl":105},{"sl":106},{"sl":185},{"sl":186},{"sl":218},{"sl":342}]},"test_1639":{"methods":[{"sl":81},{"sl":137},{"sl":217},{"sl":236},{"sl":341}],"name":"testFactory_hoursBetween_RPartial","pass":true,"statements":[{"sl":82},{"sl":83},{"sl":84},{"sl":89},{"sl":90},{"sl":95},{"sl":96},{"sl":105},{"sl":106},{"sl":138},{"sl":139},{"sl":140},{"sl":142},{"sl":144},{"sl":145},{"sl":218},{"sl":237},{"sl":342}]},"test_1755":{"methods":[{"sl":81},{"sl":200},{"sl":217},{"sl":341}],"name":"testFactory_parseHours_String","pass":true,"statements":[{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":86},{"sl":87},{"sl":88},{"sl":105},{"sl":106},{"sl":202},{"sl":203},{"sl":205},{"sl":206},{"sl":218},{"sl":342}]},"test_181":{"methods":[{"sl":81},{"sl":341},{"sl":355}],"name":"testPlus_int","pass":true,"statements":[{"sl":82},{"sl":87},{"sl":88},{"sl":93},{"sl":94},{"sl":342},{"sl":356},{"sl":357},{"sl":359}]},"test_1888":{"methods":[{"sl":81},{"sl":341},{"sl":355},{"sl":371}],"name":"testPlus_Hours","pass":true,"statements":[{"sl":82},{"sl":87},{"sl":88},{"sl":89},{"sl":90},{"sl":93},{"sl":94},{"sl":342},{"sl":356},{"sl":357},{"sl":359},{"sl":372},{"sl":373},{"sl":375}]},"test_1949":{"methods":[{"sl":81}],"name":"testToStandardHours","pass":true,"statements":[{"sl":82},{"sl":87},{"sl":88}]},"test_2012":{"methods":[{"sl":81},{"sl":217},{"sl":341},{"sl":355},{"sl":388},{"sl":401}],"name":"testMinus_Hours","pass":true,"statements":[{"sl":82},{"sl":87},{"sl":88},{"sl":89},{"sl":90},{"sl":105},{"sl":106},{"sl":218},{"sl":342},{"sl":356},{"sl":357},{"sl":359},{"sl":389},{"sl":402},{"sl":403},{"sl":405}]},"test_2082":{"methods":[{"sl":81},{"sl":217},{"sl":236}],"name":"testGetFieldType","pass":true,"statements":[{"sl":82},{"sl":105},{"sl":106},{"sl":218},{"sl":237}]},"test_2278":{"methods":[{"sl":81},{"sl":217},{"sl":341},{"sl":446}],"name":"testNegated","pass":true,"statements":[{"sl":82},{"sl":105},{"sl":106},{"sl":218},{"sl":342},{"sl":447}]},"test_2414":{"methods":[{"sl":81}],"name":"testToStandardHours","pass":true,"statements":[{"sl":82},{"sl":89},{"sl":90}]},"test_2423":{"methods":[{"sl":81},{"sl":217},{"sl":341},{"sl":418}],"name":"testMultipliedBy_int","pass":true,"statements":[{"sl":82},{"sl":87},{"sl":88},{"sl":95},{"sl":96},{"sl":105},{"sl":106},{"sl":218},{"sl":342},{"sl":419}]},"test_2430":{"methods":[{"sl":81},{"sl":120},{"sl":217},{"sl":341}],"name":"testFactory_hoursBetween_RInstant","pass":true,"statements":[{"sl":82},{"sl":83},{"sl":84},{"sl":89},{"sl":90},{"sl":95},{"sl":96},{"sl":105},{"sl":106},{"sl":121},{"sl":122},{"sl":218},{"sl":342}]},"test_2575":{"methods":[{"sl":81},{"sl":200},{"sl":485}],"name":"testHours","pass":true,"statements":[{"sl":82},{"sl":93},{"sl":94},{"sl":202},{"sl":205},{"sl":206},{"sl":487}]},"test_261":{"methods":[{"sl":81},{"sl":312}],"name":"testToStandardSeconds","pass":true,"statements":[{"sl":82},{"sl":89},{"sl":90},{"sl":313}]},"test_2663":{"methods":[{"sl":81},{"sl":217},{"sl":341}],"name":"testFactory_hours_int","pass":true,"statements":[{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":86},{"sl":87},{"sl":88},{"sl":89},{"sl":90},{"sl":91},{"sl":92},{"sl":93},{"sl":94},{"sl":95},{"sl":96},{"sl":97},{"sl":98},{"sl":99},{"sl":100},{"sl":101},{"sl":102},{"sl":103},{"sl":104},{"sl":105},{"sl":106},{"sl":218},{"sl":342}]},"test_2706":{"methods":[{"sl":81},{"sl":217},{"sl":245}],"name":"testToStandardHours","pass":true,"statements":[{"sl":82},{"sl":105},{"sl":106},{"sl":218},{"sl":246}]},"test_2771":{"methods":[{"sl":81},{"sl":217},{"sl":457}],"name":"testIsGreaterThan","pass":true,"statements":[{"sl":82},{"sl":105},{"sl":106},{"sl":218},{"sl":458},{"sl":459},{"sl":461}]},"test_2829":{"methods":[{"sl":81},{"sl":217},{"sl":470}],"name":"testIsLessThan","pass":true,"statements":[{"sl":82},{"sl":105},{"sl":106},{"sl":218},{"sl":471},{"sl":472},{"sl":474}]},"test_2910":{"methods":[{"sl":81},{"sl":217},{"sl":485}],"name":"testToString","pass":true,"statements":[{"sl":82},{"sl":105},{"sl":106},{"sl":218},{"sl":487}]},"test_443":{"methods":[{"sl":81},{"sl":217},{"sl":245}],"name":"testGetPeriodType","pass":true,"statements":[{"sl":82},{"sl":105},{"sl":106},{"sl":218},{"sl":246}]},"test_478":{"methods":[{"sl":81},{"sl":156},{"sl":341}],"name":"testFactory_hoursIn_RInterval","pass":true,"statements":[{"sl":82},{"sl":83},{"sl":84},{"sl":89},{"sl":90},{"sl":95},{"sl":96},{"sl":157},{"sl":158},{"sl":160},{"sl":161},{"sl":342}]},"test_481":{"methods":[{"sl":81},{"sl":217},{"sl":263}],"name":"testToStandardWeeks","pass":true,"statements":[{"sl":82},{"sl":105},{"sl":106},{"sl":218},{"sl":264}]},"test_512":{"methods":[{"sl":81},{"sl":341}],"name":"testToStandardHours_years","pass":true,"statements":[{"sl":82},{"sl":83},{"sl":84},{"sl":342}]},"test_724":{"methods":[{"sl":81},{"sl":217},{"sl":236}],"name":"testAddToLocalDate","pass":true,"statements":[{"sl":82},{"sl":105},{"sl":106},{"sl":218},{"sl":237}]},"test_730":{"methods":[{"sl":81},{"sl":217},{"sl":245}],"name":"testToStandardHours","pass":true,"statements":[{"sl":82},{"sl":105},{"sl":106},{"sl":218},{"sl":246}]},"test_771":{"methods":[{"sl":341}],"name":"testConstants","pass":true,"statements":[{"sl":342}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [724, 1223, 478, 261, 481, 1949, 1406, 2771, 1345, 2910, 2278, 2706, 10, 1562, 1639, 730, 1888, 2575, 181, 119, 1350, 1022, 1093, 2430, 2829, 443, 2082, 2012, 108, 2423, 2663, 1755, 2414, 1053, 512, 1356], [724, 1223, 478, 261, 481, 1949, 1406, 2771, 1345, 2910, 2278, 2706, 10, 1562, 1639, 730, 1888, 2575, 181, 119, 1350, 1022, 1093, 2430, 2829, 443, 2082, 2012, 108, 2423, 2663, 1755, 2414, 1053, 512, 1356], [478, 1562, 1639, 119, 2430, 2663, 1755, 512, 1356], [478, 1562, 1639, 119, 2430, 2663, 1755, 512, 1356], [1562, 119, 1350, 2663, 1755], [1562, 119, 1350, 2663, 1755], [1949, 1345, 10, 1562, 1888, 181, 119, 2012, 108, 2423, 2663, 1755], [1949, 1345, 10, 1562, 1888, 181, 119, 2012, 108, 2423, 2663, 1755], [478, 261, 1406, 1345, 1639, 1888, 2430, 2012, 2663, 2414], [478, 261, 1406, 1345, 1639, 1888, 2430, 2012, 2663, 2414], [1345, 2663], [1345, 2663], [1888, 2575, 181, 1350, 2663], [1888, 2575, 181, 1350, 2663], [478, 1345, 1639, 2430, 2423, 2663], [478, 1345, 1639, 2430, 2423, 2663], [1022, 2663], [1022, 2663], [2663], [2663], [1350, 2663], [1350, 2663], [2663], [2663], [724, 1223, 481, 2771, 1345, 2910, 2278, 2706, 10, 1562, 1639, 730, 119, 1350, 1093, 2430, 2829, 443, 2082, 2012, 2423, 2663, 1755, 1053], [724, 1223, 481, 2771, 1345, 2910, 2278, 2706, 10, 1562, 1639, 730, 119, 1350, 1093, 2430, 2829, 443, 2082, 2012, 2423, 2663, 1755, 1053], [], [], [], [], [], [], [], [], [], [], [], [], [], [2430], [2430], [2430], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1639], [1639], [1639], [1639], [], [1639], [], [1639], [1639], [], [], [], [], [], [], [], [], [], [], [478], [478], [478], [], [478], [478], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1562], [1562], [1562], [], [], [], [], [], [], [], [], [], [], [], [], [], [2575, 1755], [], [2575, 1755], [1755], [], [2575, 1755], [2575, 1755], [], [], [], [], [], [], [], [], [], [], [724, 1223, 481, 2771, 1345, 2910, 2278, 2706, 10, 1562, 1639, 730, 119, 1350, 1093, 2430, 2829, 443, 2082, 2012, 2423, 2663, 1755, 1053], [724, 1223, 481, 2771, 1345, 2910, 2278, 2706, 10, 1562, 1639, 730, 119, 1350, 1093, 2430, 2829, 443, 2082, 2012, 2423, 2663, 1755, 1053], [], [], [], [], [], [], [], [1022], [1022], [], [], [], [], [], [], [], [], [724, 1639, 2082], [724, 1639, 2082], [], [], [], [], [], [], [], [2706, 730, 119, 443, 108], [2706, 730, 119, 443, 108], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [481], [481], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1053], [1053], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1406], [1406], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [261], [261], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1093], [1093], [1093], [], [], [], [], [], [], [], [], [1223, 478, 1345, 2278, 10, 1562, 1639, 1888, 181, 1350, 2430, 2012, 2423, 2663, 1755, 771, 512, 1356], [1223, 478, 1345, 2278, 10, 1562, 1639, 1888, 181, 1350, 2430, 2012, 2423, 2663, 1755, 771, 512, 1356], [], [], [], [], [], [], [], [], [], [], [], [], [10, 1888, 181, 2012], [10, 1888, 181, 2012], [10, 1888, 181, 2012], [], [10, 1888, 181, 2012], [], [], [], [], [], [], [], [], [], [], [], [1888], [1888], [1888], [], [1888], [], [], [], [], [], [], [], [], [], [], [], [], [10, 2012], [10, 2012], [], [], [], [], [], [], [], [], [], [], [], [2012], [2012], [2012], [], [2012], [], [], [], [], [], [], [], [], [], [], [], [], [2423], [2423], [], [], [], [], [], [], [], [], [], [], [], [], [1345], [1345], [1345], [], [1345], [], [], [], [], [], [], [], [], [], [2278], [2278], [], [], [], [], [], [], [], [], [], [2771], [2771], [2771], [], [2771], [], [], [], [], [], [], [], [], [2829], [2829], [2829], [], [2829], [], [], [], [], [], [], [], [], [], [], [2910, 2575], [], [2910, 2575], [], [], []]
