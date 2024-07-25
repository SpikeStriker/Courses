var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":161,"id":21434,"methods":[{"el":41,"sc":5,"sl":40},{"el":49,"sc":5,"sl":46},{"el":54,"sc":5,"sl":51},{"el":100,"sc":5,"sl":56},{"el":108,"sc":5,"sl":105},{"el":113,"sc":5,"sl":110},{"el":155,"sc":5,"sl":115},{"el":160,"sc":5,"sl":158}],"name":"DefaultNameProvider","sl":35}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1069":{"methods":[{"sl":110},{"sl":115},{"sl":158}],"name":"testPatchedNameKeysGazaHistoric","pass":true,"statements":[{"sl":111},{"sl":112},{"sl":116},{"sl":119},{"sl":123},{"sl":124},{"sl":128},{"sl":129},{"sl":130},{"sl":132},{"sl":133},{"sl":134},{"sl":135},{"sl":136},{"sl":137},{"sl":140},{"sl":141},{"sl":142},{"sl":143},{"sl":144},{"sl":145},{"sl":149},{"sl":150},{"sl":151},{"sl":154},{"sl":159}]},"test_1177":{"methods":[{"sl":51},{"sl":56}],"name":"testGetNameProviderName","pass":true,"statements":[{"sl":52},{"sl":53},{"sl":57},{"sl":58}]},"test_1316":{"methods":[{"sl":40},{"sl":158}],"name":"testNameProvider","pass":true,"statements":[{"sl":159}]},"test_1782":{"methods":[{"sl":110},{"sl":115},{"sl":158}],"name":"testGetName_berlin_english","pass":true,"statements":[{"sl":111},{"sl":112},{"sl":116},{"sl":119},{"sl":123},{"sl":124},{"sl":128},{"sl":129},{"sl":130},{"sl":132},{"sl":133},{"sl":134},{"sl":135},{"sl":136},{"sl":137},{"sl":140},{"sl":141},{"sl":142},{"sl":143},{"sl":144},{"sl":145},{"sl":149},{"sl":150},{"sl":151},{"sl":154},{"sl":159}]},"test_2009":{"methods":[{"sl":110},{"sl":115}],"name":"testGetName","pass":true,"statements":[{"sl":111},{"sl":112},{"sl":116},{"sl":119},{"sl":123},{"sl":124},{"sl":128},{"sl":129},{"sl":154}]},"test_2137":{"methods":[{"sl":110},{"sl":115},{"sl":158}],"name":"testPatchedNameKeysSydney","pass":true,"statements":[{"sl":111},{"sl":112},{"sl":116},{"sl":119},{"sl":123},{"sl":124},{"sl":128},{"sl":129},{"sl":130},{"sl":132},{"sl":133},{"sl":134},{"sl":135},{"sl":136},{"sl":137},{"sl":140},{"sl":141},{"sl":142},{"sl":143},{"sl":144},{"sl":145},{"sl":149},{"sl":150},{"sl":151},{"sl":154},{"sl":159}]},"test_2251":{"methods":[{"sl":110},{"sl":115},{"sl":158}],"name":"testPatchedNameKeysSydneyHistoric","pass":true,"statements":[{"sl":111},{"sl":112},{"sl":116},{"sl":119},{"sl":123},{"sl":124},{"sl":125},{"sl":128},{"sl":129},{"sl":130},{"sl":132},{"sl":133},{"sl":134},{"sl":135},{"sl":136},{"sl":137},{"sl":140},{"sl":141},{"sl":142},{"sl":143},{"sl":144},{"sl":145},{"sl":149},{"sl":150},{"sl":151},{"sl":154},{"sl":159}]},"test_2593":{"methods":[{"sl":46},{"sl":56}],"name":"testGetShortNameProviderName","pass":true,"statements":[{"sl":47},{"sl":48},{"sl":57},{"sl":58}]},"test_2723":{"methods":[{"sl":110},{"sl":115},{"sl":158}],"name":"testGetName_berlin_german","pass":true,"statements":[{"sl":111},{"sl":112},{"sl":116},{"sl":119},{"sl":123},{"sl":124},{"sl":125},{"sl":128},{"sl":129},{"sl":130},{"sl":132},{"sl":133},{"sl":134},{"sl":135},{"sl":136},{"sl":137},{"sl":140},{"sl":141},{"sl":142},{"sl":143},{"sl":144},{"sl":145},{"sl":149},{"sl":150},{"sl":151},{"sl":154},{"sl":159}]},"test_273":{"methods":[{"sl":105},{"sl":115}],"name":"testGetShortName_berlin","pass":true,"statements":[{"sl":106},{"sl":107},{"sl":116},{"sl":119},{"sl":123},{"sl":124},{"sl":128},{"sl":129},{"sl":154}]},"test_661":{"methods":[{"sl":40},{"sl":105},{"sl":115},{"sl":158}],"name":"testGetShortName","pass":true,"statements":[{"sl":106},{"sl":107},{"sl":116},{"sl":119},{"sl":123},{"sl":124},{"sl":125},{"sl":128},{"sl":129},{"sl":130},{"sl":132},{"sl":133},{"sl":134},{"sl":135},{"sl":136},{"sl":137},{"sl":140},{"sl":141},{"sl":142},{"sl":143},{"sl":144},{"sl":145},{"sl":149},{"sl":150},{"sl":151},{"sl":154},{"sl":159}]},"test_87":{"methods":[{"sl":110},{"sl":115}],"name":"testPatchedNameKeysLondon","pass":true,"statements":[{"sl":111},{"sl":112},{"sl":116},{"sl":119},{"sl":123},{"sl":124},{"sl":128},{"sl":129},{"sl":154}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [661, 1316], [], [], [], [], [], [2593], [2593], [2593], [], [], [1177], [1177], [1177], [], [], [1177, 2593], [1177, 2593], [1177, 2593], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [661, 273], [661, 273], [661, 273], [], [], [2251, 2137, 1782, 1069, 87, 2009, 2723], [2251, 2137, 1782, 1069, 87, 2009, 2723], [2251, 2137, 1782, 1069, 87, 2009, 2723], [], [], [2251, 661, 2137, 1782, 1069, 87, 273, 2009, 2723], [2251, 661, 2137, 1782, 1069, 87, 273, 2009, 2723], [], [], [2251, 661, 2137, 1782, 1069, 87, 273, 2009, 2723], [], [], [], [2251, 661, 2137, 1782, 1069, 87, 273, 2009, 2723], [2251, 661, 2137, 1782, 1069, 87, 273, 2009, 2723], [2251, 661, 2723], [], [], [2251, 661, 2137, 1782, 1069, 87, 273, 2009, 2723], [2251, 661, 2137, 1782, 1069, 87, 273, 2009, 2723], [2251, 661, 2137, 1782, 1069, 2723], [], [2251, 661, 2137, 1782, 1069, 2723], [2251, 661, 2137, 1782, 1069, 2723], [2251, 661, 2137, 1782, 1069, 2723], [2251, 661, 2137, 1782, 1069, 2723], [2251, 661, 2137, 1782, 1069, 2723], [2251, 661, 2137, 1782, 1069, 2723], [], [], [2251, 661, 2137, 1782, 1069, 2723], [2251, 661, 2137, 1782, 1069, 2723], [2251, 661, 2137, 1782, 1069, 2723], [2251, 661, 2137, 1782, 1069, 2723], [2251, 661, 2137, 1782, 1069, 2723], [2251, 661, 2137, 1782, 1069, 2723], [], [], [], [2251, 661, 2137, 1782, 1069, 2723], [2251, 661, 2137, 1782, 1069, 2723], [2251, 661, 2137, 1782, 1069, 2723], [], [], [2251, 661, 2137, 1782, 1069, 87, 273, 2009, 2723], [], [], [], [2251, 661, 2137, 1782, 1069, 2723, 1316], [2251, 661, 2137, 1782, 1069, 2723, 1316], [], []]
