var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":657,"id":59345,"methods":[{"el":45,"sc":5,"sl":43},{"el":52,"sc":5,"sl":47},{"el":66,"sc":5,"sl":58},{"el":101,"sc":5,"sl":79},{"el":114,"sc":5,"sl":108},{"el":127,"sc":5,"sl":121},{"el":143,"sc":5,"sl":136},{"el":539,"sc":5,"sl":176},{"el":640,"sc":5,"sl":548},{"el":656,"sc":5,"sl":648}],"name":"TestUnsupportedDateTimeField","sl":36}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1912":{"methods":[{"sl":108}],"name":"testPublicGetNameMethod","pass":true,"statements":[{"sl":109},{"sl":113}]},"test_2143":{"methods":[{"sl":548}],"name":"testDelegatedMethods","pass":true,"statements":[{"sl":549},{"sl":552},{"sl":554},{"sl":562},{"sl":563},{"sl":566},{"sl":568},{"sl":569},{"sl":570},{"sl":571},{"sl":573},{"sl":583},{"sl":584},{"sl":587},{"sl":590},{"sl":591},{"sl":592},{"sl":593},{"sl":595},{"sl":596},{"sl":606},{"sl":607},{"sl":610},{"sl":613},{"sl":614},{"sl":615},{"sl":616},{"sl":626},{"sl":627},{"sl":630},{"sl":633},{"sl":634},{"sl":635},{"sl":636}]},"test_3031":{"methods":[{"sl":648}],"name":"testToString","pass":true,"statements":[{"sl":649},{"sl":653},{"sl":654},{"sl":655}]},"test_3192":{"methods":[{"sl":136}],"name":"testMethodsThatShouldAlwaysReturnNull","pass":true,"statements":[{"sl":137},{"sl":141},{"sl":142}]},"test_4059":{"methods":[{"sl":79}],"name":"testDifferentDurationReturnDifferentObjects","pass":true,"statements":[{"sl":85},{"sl":88},{"sl":91},{"sl":97},{"sl":100}]},"test_421":{"methods":[{"sl":58}],"name":"testNullValuesToGetInstanceThrowsException","pass":true,"statements":[{"sl":60},{"sl":61},{"sl":64}]},"test_731":{"methods":[{"sl":121}],"name":"testAlwaysFalseReturnTypes","pass":true,"statements":[{"sl":122},{"sl":125},{"sl":126}]},"test_872":{"methods":[{"sl":176}],"name":"testUnsupportedMethods","pass":true,"statements":[{"sl":177},{"sl":183},{"sl":184},{"sl":187},{"sl":190},{"sl":191},{"sl":194},{"sl":198},{"sl":199},{"sl":202},{"sl":206},{"sl":207},{"sl":210},{"sl":213},{"sl":214},{"sl":217},{"sl":222},{"sl":223},{"sl":226},{"sl":230},{"sl":231},{"sl":234},{"sl":238},{"sl":239},{"sl":242},{"sl":248},{"sl":249},{"sl":252},{"sl":257},{"sl":258},{"sl":261},{"sl":266},{"sl":267},{"sl":270},{"sl":274},{"sl":275},{"sl":278},{"sl":282},{"sl":283},{"sl":286},{"sl":292},{"sl":293},{"sl":296},{"sl":301},{"sl":302},{"sl":305},{"sl":310},{"sl":311},{"sl":314},{"sl":320},{"sl":321},{"sl":324},{"sl":330},{"sl":331},{"sl":334},{"sl":339},{"sl":340},{"sl":343},{"sl":349},{"sl":350},{"sl":353},{"sl":359},{"sl":360},{"sl":363},{"sl":370},{"sl":371},{"sl":374},{"sl":379},{"sl":380},{"sl":383},{"sl":388},{"sl":389},{"sl":392},{"sl":398},{"sl":399},{"sl":402},{"sl":408},{"sl":409},{"sl":412},{"sl":417},{"sl":418},{"sl":421},{"sl":426},{"sl":427},{"sl":430},{"sl":436},{"sl":437},{"sl":440},{"sl":445},{"sl":446},{"sl":449},{"sl":455},{"sl":456},{"sl":459},{"sl":465},{"sl":466},{"sl":469},{"sl":475},{"sl":476},{"sl":479},{"sl":485},{"sl":486},{"sl":489},{"sl":495},{"sl":496},{"sl":499},{"sl":506},{"sl":507},{"sl":511},{"sl":519},{"sl":520},{"sl":523},{"sl":532},{"sl":533},{"sl":537}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [421], [], [421], [421], [], [], [421], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [4059], [], [], [], [], [], [4059], [], [], [4059], [], [], [4059], [], [], [], [], [], [4059], [], [], [4059], [], [], [], [], [], [], [], [1912], [1912], [], [], [], [1912], [], [], [], [], [], [], [], [731], [731], [], [], [731], [731], [], [], [], [], [], [], [], [], [], [3192], [3192], [], [], [], [3192], [3192], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [872], [872], [], [], [], [], [], [872], [872], [], [], [872], [], [], [872], [872], [], [], [872], [], [], [], [872], [872], [], [], [872], [], [], [], [872], [872], [], [], [872], [], [], [872], [872], [], [], [872], [], [], [], [], [872], [872], [], [], [872], [], [], [], [872], [872], [], [], [872], [], [], [], [872], [872], [], [], [872], [], [], [], [], [], [872], [872], [], [], [872], [], [], [], [], [872], [872], [], [], [872], [], [], [], [], [872], [872], [], [], [872], [], [], [], [872], [872], [], [], [872], [], [], [], [872], [872], [], [], [872], [], [], [], [], [], [872], [872], [], [], [872], [], [], [], [], [872], [872], [], [], [872], [], [], [], [], [872], [872], [], [], [872], [], [], [], [], [], [872], [872], [], [], [872], [], [], [], [], [], [872], [872], [], [], [872], [], [], [], [], [872], [872], [], [], [872], [], [], [], [], [], [872], [872], [], [], [872], [], [], [], [], [], [872], [872], [], [], [872], [], [], [], [], [], [], [872], [872], [], [], [872], [], [], [], [], [872], [872], [], [], [872], [], [], [], [], [872], [872], [], [], [872], [], [], [], [], [], [872], [872], [], [], [872], [], [], [], [], [], [872], [872], [], [], [872], [], [], [], [], [872], [872], [], [], [872], [], [], [], [], [872], [872], [], [], [872], [], [], [], [], [], [872], [872], [], [], [872], [], [], [], [], [872], [872], [], [], [872], [], [], [], [], [], [872], [872], [], [], [872], [], [], [], [], [], [872], [872], [], [], [872], [], [], [], [], [], [872], [872], [], [], [872], [], [], [], [], [], [872], [872], [], [], [872], [], [], [], [], [], [872], [872], [], [], [872], [], [], [], [], [], [], [872], [872], [], [], [], [872], [], [], [], [], [], [], [], [872], [872], [], [], [872], [], [], [], [], [], [], [], [], [872], [872], [], [], [], [872], [], [], [], [], [], [], [], [], [], [], [2143], [2143], [], [], [2143], [], [2143], [], [], [], [], [], [], [], [2143], [2143], [], [], [2143], [], [2143], [2143], [2143], [2143], [], [2143], [], [], [], [], [], [], [], [], [], [2143], [2143], [], [], [2143], [], [], [2143], [2143], [2143], [2143], [], [2143], [2143], [], [], [], [], [], [], [], [], [], [2143], [2143], [], [], [2143], [], [], [2143], [2143], [2143], [2143], [], [], [], [], [], [], [], [], [], [2143], [2143], [], [], [2143], [], [], [2143], [2143], [2143], [2143], [], [], [], [], [], [], [], [], [], [], [], [3031], [3031], [], [], [], [3031], [3031], [3031], [], []]
