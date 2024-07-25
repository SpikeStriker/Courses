var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":228,"id":22456,"methods":[{"el":52,"sc":5,"sl":50},{"el":56,"sc":5,"sl":54},{"el":60,"sc":5,"sl":58},{"el":66,"sc":5,"sl":62},{"el":72,"sc":5,"sl":68},{"el":88,"sc":5,"sl":75},{"el":96,"sc":5,"sl":90},{"el":111,"sc":5,"sl":98},{"el":126,"sc":5,"sl":113},{"el":134,"sc":5,"sl":128},{"el":146,"sc":5,"sl":136}],"name":"TestAbstractPartial","sl":31},{"el":183,"id":22522,"methods":[{"el":155,"sc":9,"sl":153},{"el":166,"sc":9,"sl":157},{"el":170,"sc":9,"sl":168},{"el":174,"sc":9,"sl":172},{"el":178,"sc":9,"sl":176},{"el":182,"sc":9,"sl":180}],"name":"TestAbstractPartial.MockPartial","sl":149},{"el":196,"id":22540,"methods":[{"el":189,"sc":9,"sl":187},{"el":192,"sc":9,"sl":190},{"el":195,"sc":9,"sl":193}],"name":"TestAbstractPartial.MockProperty0","sl":185},{"el":208,"id":22546,"methods":[{"el":201,"sc":9,"sl":199},{"el":204,"sc":9,"sl":202},{"el":207,"sc":9,"sl":205}],"name":"TestAbstractPartial.MockProperty1","sl":197},{"el":213,"id":22552,"methods":[{"el":212,"sc":9,"sl":210}],"name":"TestAbstractPartial.MockProperty0Field","sl":209},{"el":218,"id":22554,"methods":[{"el":217,"sc":9,"sl":215}],"name":"TestAbstractPartial.MockProperty0Val","sl":214},{"el":227,"id":22556,"methods":[{"el":224,"sc":17,"sl":222},{"el":226,"sc":9,"sl":220}],"name":"TestAbstractPartial.MockProperty0Chrono","sl":219}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1395":{"methods":[{"sl":136},{"sl":153},{"sl":157},{"sl":172},{"sl":180},{"sl":187},{"sl":190},{"sl":193},{"sl":205},{"sl":210},{"sl":215},{"sl":220},{"sl":222}],"name":"testGetPropertyEquals","pass":true,"statements":[{"sl":137},{"sl":138},{"sl":139},{"sl":140},{"sl":141},{"sl":142},{"sl":143},{"sl":144},{"sl":145},{"sl":154},{"sl":158},{"sl":159},{"sl":160},{"sl":173},{"sl":181},{"sl":188},{"sl":191},{"sl":194},{"sl":206},{"sl":211},{"sl":216},{"sl":221},{"sl":223}]},"test_1588":{"methods":[{"sl":75},{"sl":153},{"sl":172}],"name":"testGetValue","pass":true,"statements":[{"sl":76},{"sl":77},{"sl":78},{"sl":80},{"sl":81},{"sl":84},{"sl":85},{"sl":154},{"sl":173}]},"test_1767":{"methods":[{"sl":128},{"sl":153},{"sl":157},{"sl":168},{"sl":180}],"name":"testGetFieldTypes","pass":true,"statements":[{"sl":129},{"sl":130},{"sl":131},{"sl":132},{"sl":133},{"sl":154},{"sl":158},{"sl":159},{"sl":160},{"sl":161},{"sl":162},{"sl":169},{"sl":181}]},"test_2314":{"methods":[{"sl":113},{"sl":153},{"sl":157},{"sl":180}],"name":"testGetFieldType","pass":true,"statements":[{"sl":114},{"sl":115},{"sl":116},{"sl":118},{"sl":119},{"sl":122},{"sl":123},{"sl":154},{"sl":158},{"sl":159},{"sl":160},{"sl":161},{"sl":162},{"sl":163},{"sl":164},{"sl":181}]},"test_259":{"methods":[{"sl":98},{"sl":153},{"sl":157},{"sl":180}],"name":"testGetField","pass":true,"statements":[{"sl":99},{"sl":100},{"sl":101},{"sl":103},{"sl":104},{"sl":107},{"sl":108},{"sl":154},{"sl":158},{"sl":159},{"sl":160},{"sl":161},{"sl":162},{"sl":163},{"sl":164},{"sl":181}]},"test_2826":{"methods":[{"sl":90},{"sl":153},{"sl":168},{"sl":172}],"name":"testGetValues","pass":true,"statements":[{"sl":91},{"sl":92},{"sl":93},{"sl":94},{"sl":95},{"sl":154},{"sl":169},{"sl":173}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1588], [1588], [1588], [1588], [], [1588], [1588], [], [], [1588], [1588], [], [], [], [], [2826], [2826], [2826], [2826], [2826], [2826], [], [], [259], [259], [259], [259], [], [259], [259], [], [], [259], [259], [], [], [], [], [2314], [2314], [2314], [2314], [], [2314], [2314], [], [], [2314], [2314], [], [], [], [], [1767], [1767], [1767], [1767], [1767], [1767], [], [], [1395], [1395], [1395], [1395], [1395], [1395], [1395], [1395], [1395], [1395], [], [], [], [], [], [], [], [2826, 1395, 1588, 259, 2314, 1767], [2826, 1395, 1588, 259, 2314, 1767], [], [], [1395, 259, 2314, 1767], [1395, 259, 2314, 1767], [1395, 259, 2314, 1767], [1395, 259, 2314, 1767], [259, 2314, 1767], [259, 2314, 1767], [259, 2314], [259, 2314], [], [], [], [2826, 1767], [2826, 1767], [], [], [2826, 1395, 1588], [2826, 1395, 1588], [], [], [], [], [], [], [1395, 259, 2314, 1767], [1395, 259, 2314, 1767], [], [], [], [], [], [1395], [1395], [], [1395], [1395], [], [1395], [1395], [], [], [], [], [], [], [], [], [], [], [1395], [1395], [], [], [], [1395], [1395], [], [], [], [1395], [1395], [], [], [], [1395], [1395], [1395], [1395], [], [], [], [], []]
