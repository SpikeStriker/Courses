var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":416,"id":44413,"methods":[{"el":64,"sc":5,"sl":62},{"el":68,"sc":5,"sl":66},{"el":72,"sc":5,"sl":70},{"el":77,"sc":5,"sl":74},{"el":82,"sc":5,"sl":79},{"el":102,"sc":5,"sl":85},{"el":110,"sc":5,"sl":104},{"el":160,"sc":5,"sl":134},{"el":176,"sc":5,"sl":162},{"el":192,"sc":5,"sl":178},{"el":199,"sc":5,"sl":194},{"el":206,"sc":5,"sl":201},{"el":213,"sc":5,"sl":208},{"el":235,"sc":5,"sl":215},{"el":255,"sc":5,"sl":238},{"el":263,"sc":5,"sl":257},{"el":349,"sc":5,"sl":305},{"el":362,"sc":5,"sl":351},{"el":378,"sc":5,"sl":364},{"el":385,"sc":5,"sl":380},{"el":407,"sc":5,"sl":387},{"el":415,"sc":5,"sl":410}],"name":"TestPartial_Properties","sl":28}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1006":{"methods":[{"sl":85}],"name":"testPropertyGetHour","pass":true,"statements":[{"sl":86},{"sl":87},{"sl":88},{"sl":89},{"sl":90},{"sl":91},{"sl":92},{"sl":93},{"sl":94},{"sl":95},{"sl":96},{"sl":97},{"sl":98},{"sl":99},{"sl":100},{"sl":101}]},"test_1057":{"methods":[{"sl":387}],"name":"testPropertyCompareToMinute","pass":true,"statements":[{"sl":388},{"sl":389},{"sl":390},{"sl":391},{"sl":392},{"sl":393},{"sl":394},{"sl":398},{"sl":399},{"sl":400},{"sl":401},{"sl":402},{"sl":403},{"sl":404}]},"test_1390":{"methods":[{"sl":215}],"name":"testPropertyCompareToHour","pass":true,"statements":[{"sl":216},{"sl":217},{"sl":218},{"sl":219},{"sl":220},{"sl":221},{"sl":222},{"sl":226},{"sl":227},{"sl":228},{"sl":229},{"sl":230},{"sl":231},{"sl":232}]},"test_1683":{"methods":[{"sl":134},{"sl":410}],"name":"testPropertyAddHour","pass":true,"statements":[{"sl":135},{"sl":136},{"sl":137},{"sl":138},{"sl":140},{"sl":141},{"sl":143},{"sl":144},{"sl":146},{"sl":147},{"sl":150},{"sl":152},{"sl":153},{"sl":155},{"sl":156},{"sl":159},{"sl":411},{"sl":412},{"sl":413},{"sl":414}]},"test_1927":{"methods":[{"sl":380},{"sl":410}],"name":"testPropertySetTextMinute","pass":true,"statements":[{"sl":381},{"sl":382},{"sl":383},{"sl":384},{"sl":411},{"sl":412},{"sl":413},{"sl":414}]},"test_2085":{"methods":[{"sl":208},{"sl":410}],"name":"testPropertyWithMinimumValueHour","pass":true,"statements":[{"sl":209},{"sl":210},{"sl":211},{"sl":212},{"sl":411},{"sl":412},{"sl":413},{"sl":414}]},"test_2174":{"methods":[{"sl":178},{"sl":410}],"name":"testPropertySetHour","pass":true,"statements":[{"sl":179},{"sl":180},{"sl":181},{"sl":182},{"sl":184},{"sl":185},{"sl":188},{"sl":189},{"sl":411},{"sl":412},{"sl":413},{"sl":414}]},"test_226":{"methods":[{"sl":364},{"sl":410}],"name":"testPropertySetMinute","pass":true,"statements":[{"sl":365},{"sl":366},{"sl":367},{"sl":368},{"sl":370},{"sl":371},{"sl":374},{"sl":375},{"sl":411},{"sl":412},{"sl":413},{"sl":414}]},"test_2400":{"methods":[{"sl":194},{"sl":410}],"name":"testPropertySetTextHour","pass":true,"statements":[{"sl":195},{"sl":196},{"sl":197},{"sl":198},{"sl":411},{"sl":412},{"sl":413},{"sl":414}]},"test_2690":{"methods":[{"sl":257}],"name":"testPropertyGetMaxMinValuesMinute","pass":true,"statements":[{"sl":258},{"sl":259},{"sl":260},{"sl":261},{"sl":262}]},"test_2693":{"methods":[{"sl":238}],"name":"testPropertyGetMinute","pass":true,"statements":[{"sl":239},{"sl":240},{"sl":241},{"sl":242},{"sl":243},{"sl":244},{"sl":245},{"sl":246},{"sl":247},{"sl":248},{"sl":249},{"sl":250},{"sl":251},{"sl":252},{"sl":253},{"sl":254}]},"test_2798":{"methods":[{"sl":104}],"name":"testPropertyGetMaxMinValuesHour","pass":true,"statements":[{"sl":105},{"sl":106},{"sl":107},{"sl":108},{"sl":109}]},"test_2929":{"methods":[{"sl":351},{"sl":410}],"name":"testPropertyAddWrapFieldMinute","pass":true,"statements":[{"sl":352},{"sl":353},{"sl":354},{"sl":355},{"sl":357},{"sl":358},{"sl":360},{"sl":361},{"sl":411},{"sl":412},{"sl":413},{"sl":414}]},"test_458":{"methods":[{"sl":305},{"sl":410}],"name":"testPropertyAddMinute","pass":true,"statements":[{"sl":306},{"sl":307},{"sl":308},{"sl":309},{"sl":311},{"sl":312},{"sl":314},{"sl":315},{"sl":317},{"sl":318},{"sl":320},{"sl":321},{"sl":323},{"sl":324},{"sl":327},{"sl":329},{"sl":330},{"sl":332},{"sl":333},{"sl":335},{"sl":336},{"sl":338},{"sl":339},{"sl":341},{"sl":342},{"sl":344},{"sl":345},{"sl":348},{"sl":411},{"sl":412},{"sl":413},{"sl":414}]},"test_628":{"methods":[{"sl":162},{"sl":410}],"name":"testPropertyAddWrapFieldHour","pass":true,"statements":[{"sl":163},{"sl":164},{"sl":165},{"sl":166},{"sl":168},{"sl":169},{"sl":171},{"sl":172},{"sl":174},{"sl":175},{"sl":411},{"sl":412},{"sl":413},{"sl":414}]},"test_954":{"methods":[{"sl":201},{"sl":410}],"name":"testPropertyWithMaximumValueHour","pass":true,"statements":[{"sl":202},{"sl":203},{"sl":204},{"sl":205},{"sl":411},{"sl":412},{"sl":413},{"sl":414}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1006], [1006], [1006], [1006], [1006], [1006], [1006], [1006], [1006], [1006], [1006], [1006], [1006], [1006], [1006], [1006], [1006], [], [], [2798], [2798], [2798], [2798], [2798], [2798], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1683], [1683], [1683], [1683], [1683], [], [1683], [1683], [], [1683], [1683], [], [1683], [1683], [], [], [1683], [], [1683], [1683], [], [1683], [1683], [], [], [1683], [], [], [628], [628], [628], [628], [628], [], [628], [628], [], [628], [628], [], [628], [628], [], [], [2174], [2174], [2174], [2174], [2174], [], [2174], [2174], [], [], [2174], [2174], [], [], [], [], [2400], [2400], [2400], [2400], [2400], [], [], [954], [954], [954], [954], [954], [], [], [2085], [2085], [2085], [2085], [2085], [], [], [1390], [1390], [1390], [1390], [1390], [1390], [1390], [1390], [], [], [], [1390], [1390], [1390], [1390], [1390], [1390], [1390], [], [], [], [], [], [2693], [2693], [2693], [2693], [2693], [2693], [2693], [2693], [2693], [2693], [2693], [2693], [2693], [2693], [2693], [2693], [2693], [], [], [2690], [2690], [2690], [2690], [2690], [2690], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [458], [458], [458], [458], [458], [], [458], [458], [], [458], [458], [], [458], [458], [], [458], [458], [], [458], [458], [], [], [458], [], [458], [458], [], [458], [458], [], [458], [458], [], [458], [458], [], [458], [458], [], [458], [458], [], [], [458], [], [], [2929], [2929], [2929], [2929], [2929], [], [2929], [2929], [], [2929], [2929], [], [], [226], [226], [226], [226], [226], [], [226], [226], [], [], [226], [226], [], [], [], [], [1927], [1927], [1927], [1927], [1927], [], [], [1057], [1057], [1057], [1057], [1057], [1057], [1057], [1057], [], [], [], [1057], [1057], [1057], [1057], [1057], [1057], [1057], [], [], [], [], [], [628, 954, 2085, 2400, 458, 2929, 1927, 226, 1683, 2174], [628, 954, 2085, 2400, 458, 2929, 1927, 226, 1683, 2174], [628, 954, 2085, 2400, 458, 2929, 1927, 226, 1683, 2174], [628, 954, 2085, 2400, 458, 2929, 1927, 226, 1683, 2174], [628, 954, 2085, 2400, 458, 2929, 1927, 226, 1683, 2174], [], []]
