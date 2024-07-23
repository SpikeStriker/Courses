var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":321,"id":51348,"methods":[{"el":38,"sc":5,"sl":36},{"el":42,"sc":5,"sl":40},{"el":46,"sc":5,"sl":44},{"el":49,"sc":5,"sl":48},{"el":52,"sc":5,"sl":51},{"el":62,"sc":5,"sl":55},{"el":74,"sc":5,"sl":65},{"el":87,"sc":5,"sl":77},{"el":100,"sc":5,"sl":89},{"el":112,"sc":5,"sl":102},{"el":133,"sc":5,"sl":114},{"el":139,"sc":5,"sl":136},{"el":144,"sc":5,"sl":141},{"el":149,"sc":5,"sl":146},{"el":158,"sc":5,"sl":152},{"el":166,"sc":5,"sl":160},{"el":175,"sc":5,"sl":169},{"el":193,"sc":5,"sl":178},{"el":210,"sc":5,"sl":196},{"el":229,"sc":5,"sl":212},{"el":245,"sc":5,"sl":231},{"el":264,"sc":5,"sl":247},{"el":280,"sc":5,"sl":266},{"el":298,"sc":5,"sl":282},{"el":311,"sc":5,"sl":300},{"el":319,"sc":5,"sl":314}],"name":"TestYears","sl":31}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_105":{"methods":[{"sl":55}],"name":"testConstants","pass":true,"statements":[{"sl":56},{"sl":57},{"sl":58},{"sl":59},{"sl":60},{"sl":61}]},"test_1312":{"methods":[{"sl":169}],"name":"testToString","pass":true,"statements":[{"sl":170},{"sl":171},{"sl":173},{"sl":174}]},"test_1528":{"methods":[{"sl":231}],"name":"testMinus_int","pass":true,"statements":[{"sl":232},{"sl":233},{"sl":234},{"sl":235},{"sl":237},{"sl":239},{"sl":240}]},"test_1561":{"methods":[{"sl":152}],"name":"testIsGreaterThan","pass":true,"statements":[{"sl":153},{"sl":154},{"sl":155},{"sl":156},{"sl":157}]},"test_1683":{"methods":[{"sl":114}],"name":"testFactory_parseYears_String","pass":true,"statements":[{"sl":115},{"sl":116},{"sl":117},{"sl":118},{"sl":119},{"sl":120},{"sl":121},{"sl":122},{"sl":127},{"sl":128}]},"test_1795":{"methods":[{"sl":102}],"name":"testFactory_yearsIn_RInterval","pass":true,"statements":[{"sl":103},{"sl":104},{"sl":105},{"sl":107},{"sl":108},{"sl":109},{"sl":110},{"sl":111}]},"test_1939":{"methods":[{"sl":89}],"name":"testFactory_yearsBetween_RPartial","pass":true,"statements":[{"sl":91},{"sl":92},{"sl":93},{"sl":95},{"sl":96},{"sl":97},{"sl":98},{"sl":99}]},"test_202":{"methods":[{"sl":65}],"name":"testFactory_years_int","pass":true,"statements":[{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":70},{"sl":71},{"sl":72},{"sl":73}]},"test_2133":{"methods":[{"sl":196}],"name":"testPlus_int","pass":true,"statements":[{"sl":197},{"sl":198},{"sl":199},{"sl":200},{"sl":202},{"sl":204},{"sl":205}]},"test_2184":{"methods":[{"sl":136}],"name":"testGetMethods","pass":true,"statements":[{"sl":137},{"sl":138}]},"test_2324":{"methods":[{"sl":314}],"name":"testAddToLocalDate","pass":true,"statements":[{"sl":315},{"sl":316},{"sl":317},{"sl":318}]},"test_2442":{"methods":[{"sl":212}],"name":"testPlus_Years","pass":true,"statements":[{"sl":213},{"sl":214},{"sl":215},{"sl":216},{"sl":217},{"sl":218},{"sl":220},{"sl":221},{"sl":223},{"sl":224}]},"test_3753":{"methods":[{"sl":146}],"name":"testGetPeriodType","pass":true,"statements":[{"sl":147},{"sl":148}]},"test_3816":{"methods":[{"sl":178}],"name":"testSerialization","pass":true,"statements":[{"sl":179},{"sl":181},{"sl":182},{"sl":183},{"sl":184},{"sl":185},{"sl":187},{"sl":188},{"sl":189},{"sl":190},{"sl":192}]},"test_3905":{"methods":[{"sl":141}],"name":"testGetFieldType","pass":true,"statements":[{"sl":142},{"sl":143}]},"test_3963":{"methods":[{"sl":160}],"name":"testIsLessThan","pass":true,"statements":[{"sl":161},{"sl":162},{"sl":163},{"sl":164},{"sl":165}]},"test_4177":{"methods":[{"sl":266}],"name":"testMultipliedBy_int","pass":true,"statements":[{"sl":267},{"sl":268},{"sl":269},{"sl":270},{"sl":271},{"sl":273},{"sl":274},{"sl":275}]},"test_633":{"methods":[{"sl":300}],"name":"testNegated","pass":true,"statements":[{"sl":301},{"sl":302},{"sl":303},{"sl":305},{"sl":306}]},"test_784":{"methods":[{"sl":247}],"name":"testMinus_Years","pass":true,"statements":[{"sl":248},{"sl":249},{"sl":250},{"sl":251},{"sl":252},{"sl":253},{"sl":255},{"sl":256},{"sl":258},{"sl":259}]},"test_898":{"methods":[{"sl":77}],"name":"testFactory_yearsBetween_RInstant","pass":true,"statements":[{"sl":78},{"sl":79},{"sl":80},{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":86}]},"test_908":{"methods":[{"sl":282}],"name":"testDividedBy_int","pass":true,"statements":[{"sl":283},{"sl":284},{"sl":285},{"sl":286},{"sl":287},{"sl":288},{"sl":289},{"sl":290},{"sl":292},{"sl":293}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [105], [105], [105], [105], [105], [105], [105], [], [], [], [202], [202], [202], [202], [202], [202], [202], [202], [202], [], [], [], [898], [898], [898], [898], [], [898], [898], [898], [898], [898], [], [], [1939], [], [1939], [1939], [1939], [], [1939], [1939], [1939], [1939], [1939], [], [], [1795], [1795], [1795], [1795], [], [1795], [1795], [1795], [1795], [1795], [], [], [1683], [1683], [1683], [1683], [1683], [1683], [1683], [1683], [1683], [], [], [], [], [1683], [1683], [], [], [], [], [], [], [], [2184], [2184], [2184], [], [], [3905], [3905], [3905], [], [], [3753], [3753], [3753], [], [], [], [1561], [1561], [1561], [1561], [1561], [1561], [], [], [3963], [3963], [3963], [3963], [3963], [3963], [], [], [], [1312], [1312], [1312], [], [1312], [1312], [], [], [], [3816], [3816], [], [3816], [3816], [3816], [3816], [3816], [], [3816], [3816], [3816], [3816], [], [3816], [], [], [], [2133], [2133], [2133], [2133], [2133], [], [2133], [], [2133], [2133], [], [], [], [], [], [], [2442], [2442], [2442], [2442], [2442], [2442], [2442], [], [2442], [2442], [], [2442], [2442], [], [], [], [], [], [], [1528], [1528], [1528], [1528], [1528], [], [1528], [], [1528], [1528], [], [], [], [], [], [], [784], [784], [784], [784], [784], [784], [784], [], [784], [784], [], [784], [784], [], [], [], [], [], [], [4177], [4177], [4177], [4177], [4177], [4177], [], [4177], [4177], [4177], [], [], [], [], [], [], [908], [908], [908], [908], [908], [908], [908], [908], [908], [], [908], [908], [], [], [], [], [], [], [633], [633], [633], [633], [], [633], [633], [], [], [], [], [], [], [], [2324], [2324], [2324], [2324], [2324], [], [], []]
