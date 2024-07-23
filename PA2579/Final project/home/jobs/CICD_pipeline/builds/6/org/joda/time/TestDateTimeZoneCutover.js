var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":1374,"id":25989,"methods":[{"el":33,"sc":5,"sl":31},{"el":37,"sc":5,"sl":35},{"el":41,"sc":5,"sl":39},{"el":44,"sc":5,"sl":43},{"el":47,"sc":5,"sl":46},{"el":68,"sc":5,"sl":61},{"el":82,"sc":5,"sl":70},{"el":89,"sc":5,"sl":84},{"el":96,"sc":5,"sl":91},{"el":103,"sc":5,"sl":98},{"el":114,"sc":5,"sl":105},{"el":125,"sc":5,"sl":116},{"el":132,"sc":5,"sl":127},{"el":144,"sc":5,"sl":134},{"el":156,"sc":5,"sl":146},{"el":166,"sc":5,"sl":158},{"el":176,"sc":5,"sl":168},{"el":186,"sc":5,"sl":178},{"el":196,"sc":5,"sl":188},{"el":204,"sc":5,"sl":198},{"el":212,"sc":5,"sl":206},{"el":220,"sc":5,"sl":214},{"el":230,"sc":5,"sl":222},{"el":239,"sc":5,"sl":232},{"el":250,"sc":5,"sl":241},{"el":259,"sc":5,"sl":252},{"el":277,"sc":5,"sl":270},{"el":291,"sc":5,"sl":279},{"el":299,"sc":5,"sl":293},{"el":306,"sc":5,"sl":301},{"el":313,"sc":5,"sl":308},{"el":320,"sc":5,"sl":315},{"el":331,"sc":5,"sl":322},{"el":342,"sc":5,"sl":333},{"el":349,"sc":5,"sl":344},{"el":361,"sc":5,"sl":351},{"el":373,"sc":5,"sl":363},{"el":383,"sc":5,"sl":375},{"el":393,"sc":5,"sl":385},{"el":403,"sc":5,"sl":395},{"el":413,"sc":5,"sl":405},{"el":421,"sc":5,"sl":415},{"el":429,"sc":5,"sl":423},{"el":437,"sc":5,"sl":431},{"el":447,"sc":5,"sl":439},{"el":456,"sc":5,"sl":449},{"el":466,"sc":5,"sl":458},{"el":475,"sc":5,"sl":468},{"el":496,"sc":5,"sl":489},{"el":512,"sc":5,"sl":498},{"el":519,"sc":5,"sl":514},{"el":531,"sc":5,"sl":521},{"el":543,"sc":5,"sl":533},{"el":551,"sc":5,"sl":546},{"el":558,"sc":5,"sl":553},{"el":565,"sc":5,"sl":560},{"el":572,"sc":5,"sl":567},{"el":579,"sc":5,"sl":574},{"el":586,"sc":5,"sl":581},{"el":594,"sc":5,"sl":589},{"el":601,"sc":5,"sl":596},{"el":608,"sc":5,"sl":603},{"el":615,"sc":5,"sl":610},{"el":622,"sc":5,"sl":617},{"el":629,"sc":5,"sl":624},{"el":643,"sc":5,"sl":636},{"el":661,"sc":5,"sl":645},{"el":666,"sc":5,"sl":663},{"el":680,"sc":5,"sl":668},{"el":694,"sc":5,"sl":682},{"el":702,"sc":5,"sl":697},{"el":709,"sc":5,"sl":704},{"el":716,"sc":5,"sl":711},{"el":723,"sc":5,"sl":718},{"el":730,"sc":5,"sl":725},{"el":737,"sc":5,"sl":732},{"el":744,"sc":5,"sl":739},{"el":751,"sc":5,"sl":746},{"el":759,"sc":5,"sl":754},{"el":766,"sc":5,"sl":761},{"el":773,"sc":5,"sl":768},{"el":780,"sc":5,"sl":775},{"el":787,"sc":5,"sl":782},{"el":794,"sc":5,"sl":789},{"el":801,"sc":5,"sl":796},{"el":808,"sc":5,"sl":803},{"el":827,"sc":5,"sl":816},{"el":843,"sc":5,"sl":829},{"el":850,"sc":5,"sl":845},{"el":862,"sc":5,"sl":852},{"el":874,"sc":5,"sl":864},{"el":888,"sc":5,"sl":881},{"el":909,"sc":5,"sl":890},{"el":919,"sc":5,"sl":911},{"el":924,"sc":5,"sl":921},{"el":938,"sc":5,"sl":926},{"el":952,"sc":5,"sl":940},{"el":969,"sc":5,"sl":962},{"el":1010,"sc":5,"sl":971},{"el":1030,"sc":5,"sl":1012},{"el":1050,"sc":5,"sl":1032},{"el":1067,"sc":5,"sl":1060},{"el":1082,"sc":5,"sl":1069},{"el":1103,"sc":5,"sl":1088},{"el":1136,"sc":5,"sl":1118},{"el":1143,"sc":5,"sl":1138},{"el":1150,"sc":5,"sl":1145},{"el":1157,"sc":5,"sl":1152},{"el":1164,"sc":5,"sl":1159},{"el":1171,"sc":5,"sl":1166},{"el":1178,"sc":5,"sl":1173},{"el":1185,"sc":5,"sl":1180},{"el":1192,"sc":5,"sl":1187},{"el":1199,"sc":5,"sl":1194},{"el":1206,"sc":5,"sl":1201},{"el":1225,"sc":5,"sl":1208},{"el":1244,"sc":5,"sl":1227},{"el":1251,"sc":5,"sl":1246},{"el":1263,"sc":5,"sl":1253},{"el":1280,"sc":5,"sl":1266},{"el":1296,"sc":5,"sl":1282},{"el":1312,"sc":5,"sl":1298},{"el":1321,"sc":5,"sl":1316},{"el":1328,"sc":5,"sl":1323},{"el":1335,"sc":5,"sl":1330},{"el":1342,"sc":5,"sl":1337},{"el":1349,"sc":5,"sl":1344},{"el":1356,"sc":5,"sl":1354},{"el":1360,"sc":5,"sl":1358},{"el":1364,"sc":5,"sl":1362},{"el":1372,"sc":5,"sl":1366}],"name":"TestDateTimeZoneCutover","sl":29}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1089":{"methods":[{"sl":1138}],"name":"testWithHourOfDayInDstChange","pass":true,"statements":[{"sl":1139},{"sl":1140},{"sl":1141},{"sl":1142}]},"test_1104":{"methods":[{"sl":617}],"name":"test_DateTime_roundCeiling_minute_NewYork_Spring_preCutover","pass":true,"statements":[{"sl":618},{"sl":619},{"sl":620},{"sl":621}]},"test_1163":{"methods":[{"sl":881}],"name":"test_MoscowIsCorrect_Autumn","pass":true,"statements":[{"sl":882},{"sl":883},{"sl":884},{"sl":885},{"sl":886},{"sl":887}]},"test_1183":{"methods":[{"sl":1069},{"sl":1362},{"sl":1366}],"name":"test_getOffsetFromLocal_RioBranco_Spring","pass":true,"statements":[{"sl":1070},{"sl":1071},{"sl":1073},{"sl":1074},{"sl":1076},{"sl":1077},{"sl":1078},{"sl":1079},{"sl":1080},{"sl":1081},{"sl":1363},{"sl":1367},{"sl":1368},{"sl":1369},{"sl":1370},{"sl":1371}]},"test_1240":{"methods":[{"sl":1323}],"name":"testDateTimeCreation_paris","pass":true,"statements":[{"sl":1324},{"sl":1325},{"sl":1326},{"sl":1327}]},"test_1245":{"methods":[{"sl":458}],"name":"test_DateTime_newValid_Turk","pass":true,"statements":[{"sl":459},{"sl":460},{"sl":461},{"sl":462},{"sl":463},{"sl":464},{"sl":465}]},"test_1249":{"methods":[{"sl":1032}],"name":"test_DateTime_minusHour_Guatemata_Autumn","pass":true,"statements":[{"sl":1033},{"sl":1034},{"sl":1036},{"sl":1037},{"sl":1038},{"sl":1039},{"sl":1040},{"sl":1041},{"sl":1042},{"sl":1043},{"sl":1044},{"sl":1045},{"sl":1046},{"sl":1047},{"sl":1048},{"sl":1049}]},"test_1269":{"methods":[{"sl":489}],"name":"test_NewYorkIsCorrect_Spring","pass":true,"statements":[{"sl":490},{"sl":491},{"sl":492},{"sl":493},{"sl":494},{"sl":495}]},"test_1352":{"methods":[{"sl":796}],"name":"test_DateTime_roundCeiling_secondOfMinute_NewYork_Autumn_preCutover","pass":true,"statements":[{"sl":797},{"sl":798},{"sl":799},{"sl":800}]},"test_1450":{"methods":[{"sl":533}],"name":"test_DateTime_setHourBack_NewYork_Spring","pass":true,"statements":[{"sl":534},{"sl":535},{"sl":537},{"sl":538}]},"test_1476":{"methods":[{"sl":603}],"name":"test_DateTime_roundCeiling_hour_NewYork_Spring_preCutover","pass":true,"statements":[{"sl":604},{"sl":605},{"sl":606},{"sl":607}]},"test_1482":{"methods":[{"sl":775}],"name":"test_DateTime_roundCeiling_hourOfDay_NewYork_Autumn_postCutover","pass":true,"statements":[{"sl":776},{"sl":777},{"sl":778},{"sl":779}]},"test_1618":{"methods":[{"sl":232}],"name":"test_DateTime_new_Gaza","pass":true,"statements":[{"sl":233},{"sl":234},{"sl":237}]},"test_1634":{"methods":[{"sl":1180}],"name":"testWithMillisOfSecondInDstChange_NewYork_winter","pass":true,"statements":[{"sl":1181},{"sl":1182},{"sl":1183},{"sl":1184}]},"test_1638":{"methods":[{"sl":1145}],"name":"testWithMinuteOfHourInDstChange","pass":true,"statements":[{"sl":1146},{"sl":1147},{"sl":1148},{"sl":1149}]},"test_1649":{"methods":[{"sl":1012}],"name":"test_DateTime_plusHour_Guatemata_Autumn","pass":true,"statements":[{"sl":1013},{"sl":1014},{"sl":1016},{"sl":1017},{"sl":1018},{"sl":1019},{"sl":1020},{"sl":1021},{"sl":1022},{"sl":1023},{"sl":1024},{"sl":1025},{"sl":1026},{"sl":1027},{"sl":1028},{"sl":1029}]},"test_1817":{"methods":[{"sl":1253}],"name":"testForum4013394_retainOffsetWhenRetainFields_sameOffsetsDifferentZones","pass":true,"statements":[{"sl":1254},{"sl":1255},{"sl":1256},{"sl":1257},{"sl":1258},{"sl":1259},{"sl":1261},{"sl":1262}]},"test_1819":{"methods":[{"sl":546}],"name":"test_DateTime_roundFloor_day_NewYork_Spring_preCutover","pass":true,"statements":[{"sl":547},{"sl":548},{"sl":549},{"sl":550}]},"test_1825":{"methods":[{"sl":645},{"sl":1354},{"sl":1366}],"name":"test_getOffsetFromLocal_NewYork_Autumn","pass":true,"statements":[{"sl":646},{"sl":647},{"sl":649},{"sl":650},{"sl":652},{"sl":653},{"sl":654},{"sl":655},{"sl":656},{"sl":657},{"sl":658},{"sl":659},{"sl":660},{"sl":1355},{"sl":1367},{"sl":1368},{"sl":1369},{"sl":1370},{"sl":1371}]},"test_1829":{"methods":[{"sl":188}],"name":"test_DateTime_addWrapFieldDay_Gaza","pass":true,"statements":[{"sl":189},{"sl":190},{"sl":192},{"sl":193},{"sl":194},{"sl":195}]},"test_1841":{"methods":[{"sl":98}],"name":"test_DateTime_roundCeiling_Gaza","pass":true,"statements":[{"sl":99},{"sl":100},{"sl":101},{"sl":102}]},"test_1844":{"methods":[{"sl":567}],"name":"test_DateTime_roundFloor_hour_NewYork_Spring_postCutover","pass":true,"statements":[{"sl":568},{"sl":569},{"sl":570},{"sl":571}]},"test_1921":{"methods":[{"sl":574}],"name":"test_DateTime_roundFloor_minute_NewYork_Spring_preCutover","pass":true,"statements":[{"sl":575},{"sl":576},{"sl":577},{"sl":578}]},"test_1958":{"methods":[{"sl":308}],"name":"test_DateTime_roundFloorNotDST_Turk","pass":true,"statements":[{"sl":309},{"sl":310},{"sl":311},{"sl":312}]},"test_2004":{"methods":[{"sl":70},{"sl":84}],"name":"test_getOffsetFromLocal_Gaza","pass":true,"statements":[{"sl":71},{"sl":72},{"sl":73},{"sl":74},{"sl":75},{"sl":76},{"sl":77},{"sl":78},{"sl":79},{"sl":80},{"sl":81},{"sl":85},{"sl":86},{"sl":87},{"sl":88}]},"test_2072":{"methods":[{"sl":315}],"name":"test_DateTime_roundCeiling_Turk","pass":true,"statements":[{"sl":316},{"sl":317},{"sl":318},{"sl":319}]},"test_2094":{"methods":[{"sl":1060}],"name":"test_RioBrancoIsCorrect_Spring","pass":true,"statements":[{"sl":1061},{"sl":1062},{"sl":1063},{"sl":1064},{"sl":1065},{"sl":1066}]},"test_2101":{"methods":[{"sl":911},{"sl":1354},{"sl":1366}],"name":"test_getOffsetFromLocal_Moscow_Autumn_overlap_mins","pass":true,"statements":[{"sl":912},{"sl":913},{"sl":914},{"sl":916},{"sl":1355},{"sl":1367},{"sl":1368},{"sl":1369},{"sl":1370},{"sl":1371}]},"test_2108":{"methods":[{"sl":222}],"name":"test_LocalDate_toDateMidnight_Gaza","pass":true,"statements":[{"sl":223},{"sl":224},{"sl":225},{"sl":228}]},"test_2148":{"methods":[{"sl":363}],"name":"test_DateTime_plusHour_Turk","pass":true,"statements":[{"sl":364},{"sl":365},{"sl":367},{"sl":368},{"sl":369},{"sl":370},{"sl":371},{"sl":372}]},"test_2269":{"methods":[{"sl":431}],"name":"test_LocalDate_new_Turk","pass":true,"statements":[{"sl":432},{"sl":433},{"sl":435},{"sl":436}]},"test_2279":{"methods":[{"sl":1194}],"name":"testPlusSecondsInDstChange","pass":true,"statements":[{"sl":1195},{"sl":1196},{"sl":1197},{"sl":1198}]},"test_2323":{"methods":[{"sl":351}],"name":"test_DateTime_minusHour_Turk","pass":true,"statements":[{"sl":352},{"sl":353},{"sl":355},{"sl":356},{"sl":357},{"sl":358},{"sl":359},{"sl":360}]},"test_2330":{"methods":[{"sl":845}],"name":"test_DateTime_setHourAcross_Moscow_Spring","pass":true,"statements":[{"sl":846},{"sl":847},{"sl":848},{"sl":849}]},"test_240":{"methods":[{"sl":829},{"sl":1354},{"sl":1366}],"name":"test_getOffsetFromLocal_Moscow_Spring","pass":true,"statements":[{"sl":830},{"sl":831},{"sl":833},{"sl":834},{"sl":836},{"sl":837},{"sl":838},{"sl":839},{"sl":840},{"sl":841},{"sl":842},{"sl":1355},{"sl":1367},{"sl":1368},{"sl":1369},{"sl":1370},{"sl":1371}]},"test_2462":{"methods":[{"sl":1266}],"name":"testBug3192457_adjustOffset","pass":true,"statements":[{"sl":1267},{"sl":1268},{"sl":1269},{"sl":1270},{"sl":1272},{"sl":1273},{"sl":1275},{"sl":1276},{"sl":1278},{"sl":1279}]},"test_2492":{"methods":[{"sl":711}],"name":"test_DateTime_roundFloor_hourOfDay_NewYork_Autumn_preCutover","pass":true,"statements":[{"sl":712},{"sl":713},{"sl":714},{"sl":715}]},"test_2580":{"methods":[{"sl":168}],"name":"test_DateTime_plusDay_Gaza","pass":true,"statements":[{"sl":169},{"sl":170},{"sl":172},{"sl":173},{"sl":174},{"sl":175}]},"test_2597":{"methods":[{"sl":926}],"name":"test_DateTime_plusHour_Moscow_Autumn","pass":true,"statements":[{"sl":927},{"sl":928},{"sl":930},{"sl":931},{"sl":932},{"sl":933},{"sl":934},{"sl":935},{"sl":936},{"sl":937}]},"test_2601":{"methods":[{"sl":921}],"name":"test_DateTime_constructor_Moscow_Autumn","pass":true,"statements":[{"sl":922},{"sl":923}]},"test_2621":{"methods":[{"sl":146}],"name":"test_DateTime_plusHour_Gaza","pass":true,"statements":[{"sl":147},{"sl":148},{"sl":150},{"sl":151},{"sl":152},{"sl":153},{"sl":154},{"sl":155}]},"test_2659":{"methods":[{"sl":560}],"name":"test_DateTime_roundFloor_hour_NewYork_Spring_preCutover","pass":true,"statements":[{"sl":561},{"sl":562},{"sl":563},{"sl":564}]},"test_2669":{"methods":[{"sl":971},{"sl":1362},{"sl":1366}],"name":"test_getOffsetFromLocal_Guatemata_Autumn","pass":true,"statements":[{"sl":972},{"sl":974},{"sl":977},{"sl":979},{"sl":982},{"sl":984},{"sl":986},{"sl":988},{"sl":990},{"sl":992},{"sl":994},{"sl":996},{"sl":998},{"sl":1000},{"sl":1002},{"sl":1004},{"sl":1006},{"sl":1008},{"sl":1363},{"sl":1367},{"sl":1368},{"sl":1369},{"sl":1370},{"sl":1371}]},"test_2743":{"methods":[{"sl":91}],"name":"test_DateTime_roundFloor_Gaza","pass":true,"statements":[{"sl":92},{"sl":93},{"sl":94},{"sl":95}]},"test_279":{"methods":[{"sl":198}],"name":"test_DateTime_withZoneRetainFields_Gaza","pass":true,"statements":[{"sl":199},{"sl":200},{"sl":202},{"sl":203}]},"test_2799":{"methods":[{"sl":241}],"name":"test_DateTime_newValid_Gaza","pass":true,"statements":[{"sl":242},{"sl":243},{"sl":244},{"sl":245},{"sl":246},{"sl":247},{"sl":248},{"sl":249}]},"test_2826":{"methods":[{"sl":1227}],"name":"testBug2182444_ausNSW","pass":true,"statements":[{"sl":1228},{"sl":1229},{"sl":1230},{"sl":1231},{"sl":1232},{"sl":1233},{"sl":1235},{"sl":1236},{"sl":1237},{"sl":1238},{"sl":1239},{"sl":1240},{"sl":1241},{"sl":1242},{"sl":1243}]},"test_283":{"methods":[{"sl":1298}],"name":"testBug3476684_adjustOffset_springGap","pass":true,"statements":[{"sl":1299},{"sl":1300},{"sl":1301},{"sl":1302},{"sl":1304},{"sl":1305},{"sl":1307},{"sl":1308},{"sl":1310},{"sl":1311}]},"test_2874":{"methods":[{"sl":514}],"name":"test_DateTime_setHourAcross_NewYork_Spring","pass":true,"statements":[{"sl":515},{"sl":516},{"sl":517},{"sl":518}]},"test_289":{"methods":[{"sl":1282}],"name":"testBug3476684_adjustOffset","pass":true,"statements":[{"sl":1283},{"sl":1284},{"sl":1285},{"sl":1286},{"sl":1288},{"sl":1289},{"sl":1291},{"sl":1292},{"sl":1294},{"sl":1295}]},"test_2901":{"methods":[{"sl":754}],"name":"test_DateTime_roundCeiling_day_NewYork_Autumn_preCutover","pass":true,"statements":[{"sl":755},{"sl":756},{"sl":757},{"sl":758}]},"test_2929":{"methods":[{"sl":158}],"name":"test_DateTime_minusDay_Gaza","pass":true,"statements":[{"sl":159},{"sl":160},{"sl":162},{"sl":163},{"sl":164},{"sl":165}]},"test_2971":{"methods":[{"sl":816}],"name":"test_MoscowIsCorrect_Spring","pass":true,"statements":[{"sl":821},{"sl":822},{"sl":823},{"sl":824},{"sl":825},{"sl":826}]},"test_2992":{"methods":[{"sl":553}],"name":"test_DateTime_roundFloor_day_NewYork_Spring_postCutover","pass":true,"statements":[{"sl":554},{"sl":555},{"sl":556},{"sl":557}]},"test_3":{"methods":[{"sl":682}],"name":"test_DateTime_minusHour_NewYork_Autumn","pass":true,"statements":[{"sl":683},{"sl":684},{"sl":686},{"sl":687},{"sl":688},{"sl":689},{"sl":690},{"sl":691},{"sl":692},{"sl":693}]},"test_3034":{"methods":[{"sl":1187}],"name":"testPlusMinutesInDstChange","pass":true,"statements":[{"sl":1188},{"sl":1189},{"sl":1190},{"sl":1191}]},"test_3063":{"methods":[{"sl":395}],"name":"test_DateTime_plusDayMidGap_Turk","pass":true,"statements":[{"sl":396},{"sl":397},{"sl":399},{"sl":400},{"sl":401},{"sl":402}]},"test_3136":{"methods":[{"sl":624}],"name":"test_DateTime_roundCeiling_minute_NewYork_Spring_postCutover","pass":true,"statements":[{"sl":625},{"sl":626},{"sl":627},{"sl":628}]},"test_3176":{"methods":[{"sl":333}],"name":"test_DateTime_withHourZero_Turk","pass":true,"statements":[{"sl":334},{"sl":335},{"sl":336},{"sl":337}]},"test_3178":{"methods":[{"sl":1208}],"name":"testBug2182444_usCentral","pass":true,"statements":[{"sl":1209},{"sl":1210},{"sl":1211},{"sl":1212},{"sl":1213},{"sl":1214},{"sl":1216},{"sl":1217},{"sl":1218},{"sl":1219},{"sl":1220},{"sl":1221},{"sl":1222},{"sl":1223},{"sl":1224}]},"test_3191":{"methods":[{"sl":610}],"name":"test_DateTime_roundCeiling_hour_NewYork_Spring_postCutover","pass":true,"statements":[{"sl":611},{"sl":612},{"sl":613},{"sl":614}]},"test_3199":{"methods":[{"sl":439}],"name":"test_LocalDate_toDateMidnight_Turk","pass":true,"statements":[{"sl":440},{"sl":441},{"sl":442},{"sl":445}]},"test_329":{"methods":[{"sl":663}],"name":"test_DateTime_constructor_NewYork_Autumn","pass":true,"statements":[{"sl":664},{"sl":665}]},"test_3314":{"methods":[{"sl":1201}],"name":"testPlusMillisInDstChange","pass":true,"statements":[{"sl":1202},{"sl":1203},{"sl":1204},{"sl":1205}]},"test_3350":{"methods":[{"sl":468}],"name":"test_DateTime_parse_Turk","pass":true,"statements":[{"sl":469},{"sl":470},{"sl":473}]},"test_3379":{"methods":[{"sl":385}],"name":"test_DateTime_plusDay_Turk","pass":true,"statements":[{"sl":386},{"sl":387},{"sl":389},{"sl":390},{"sl":391},{"sl":392}]},"test_3532":{"methods":[{"sl":732}],"name":"test_DateTime_roundFloor_minuteOfHour_NewYork_Autumn_postCutover","pass":true,"statements":[{"sl":733},{"sl":734},{"sl":735},{"sl":736}]},"test_3557":{"methods":[{"sl":423}],"name":"test_MutableDateTime_setZoneRetainFields_Turk","pass":true,"statements":[{"sl":424},{"sl":425},{"sl":427},{"sl":428}]},"test_3566":{"methods":[{"sl":301}],"name":"test_DateTime_roundFloor_Turk","pass":true,"statements":[{"sl":302},{"sl":303},{"sl":304},{"sl":305}]},"test_3639":{"methods":[{"sl":768}],"name":"test_DateTime_roundCeiling_hourOfDay_NewYork_Autumn_preCutover","pass":true,"statements":[{"sl":769},{"sl":770},{"sl":771},{"sl":772}]},"test_3659":{"methods":[{"sl":1344}],"name":"testDateTimeCreation_losAngeles","pass":true,"statements":[{"sl":1345},{"sl":1346},{"sl":1347},{"sl":1348}]},"test_3669":{"methods":[{"sl":864}],"name":"test_DateTime_setHourBack_Moscow_Spring","pass":true,"statements":[{"sl":865},{"sl":866},{"sl":868},{"sl":869}]},"test_3699":{"methods":[{"sl":178}],"name":"test_DateTime_plusDayMidGap_Gaza","pass":true,"statements":[{"sl":179},{"sl":180},{"sl":182},{"sl":183},{"sl":184},{"sl":185}]},"test_3709":{"methods":[{"sl":214}],"name":"test_LocalDate_new_Gaza","pass":true,"statements":[{"sl":215},{"sl":216},{"sl":218},{"sl":219}]},"test_3718":{"methods":[{"sl":344}],"name":"test_DateTime_withDay_Turk","pass":true,"statements":[{"sl":345},{"sl":346},{"sl":347},{"sl":348}]},"test_3734":{"methods":[{"sl":718}],"name":"test_DateTime_roundFloor_hourOfDay_NewYork_Autumn_postCutover","pass":true,"statements":[{"sl":719},{"sl":720},{"sl":721},{"sl":722}]},"test_3750":{"methods":[{"sl":105}],"name":"test_DateTime_setHourZero_Gaza","pass":true,"statements":[{"sl":106},{"sl":107},{"sl":108},{"sl":109}]},"test_3787":{"methods":[{"sl":415}],"name":"test_DateTime_withZoneRetainFields_Turk","pass":true,"statements":[{"sl":416},{"sl":417},{"sl":419},{"sl":420}]},"test_38":{"methods":[{"sl":782}],"name":"test_DateTime_roundCeiling_minuteOfHour_NewYork_Autumn_preCutover","pass":true,"statements":[{"sl":783},{"sl":784},{"sl":785},{"sl":786}]},"test_3804":{"methods":[{"sl":405}],"name":"test_DateTime_addWrapFieldDay_Turk","pass":true,"statements":[{"sl":406},{"sl":407},{"sl":409},{"sl":410},{"sl":411},{"sl":412}]},"test_3823":{"methods":[{"sl":1166}],"name":"testWithMillisOfSecondInDstChange_Paris_winter","pass":true,"statements":[{"sl":1167},{"sl":1168},{"sl":1169},{"sl":1170}]},"test_3829":{"methods":[{"sl":521}],"name":"test_DateTime_setHourForward_NewYork_Spring","pass":true,"statements":[{"sl":522},{"sl":523},{"sl":525},{"sl":526}]},"test_3842":{"methods":[{"sl":1118}],"name":"testWithMinuteOfHourInDstChange_mockZone","pass":true,"statements":[{"sl":1119},{"sl":1120},{"sl":1121},{"sl":1122},{"sl":1123},{"sl":1124},{"sl":1125},{"sl":1127},{"sl":1128},{"sl":1129},{"sl":1130},{"sl":1132},{"sl":1133},{"sl":1134},{"sl":1135}]},"test_3860":{"methods":[{"sl":589}],"name":"test_DateTime_roundCeiling_day_NewYork_Spring_preCutover","pass":true,"statements":[{"sl":590},{"sl":591},{"sl":592},{"sl":593}]},"test_3882":{"methods":[{"sl":1330}],"name":"testDateTimeCreation_london","pass":true,"statements":[{"sl":1331},{"sl":1332},{"sl":1333},{"sl":1334}]},"test_3975":{"methods":[{"sl":725}],"name":"test_DateTime_roundFloor_minuteOfHour_NewYork_Autumn_preCutover","pass":true,"statements":[{"sl":726},{"sl":727},{"sl":728},{"sl":729}]},"test_3986":{"methods":[{"sl":375}],"name":"test_DateTime_minusDay_Turk","pass":true,"statements":[{"sl":376},{"sl":377},{"sl":379},{"sl":380},{"sl":381},{"sl":382}]},"test_3987":{"methods":[{"sl":890},{"sl":1354},{"sl":1358},{"sl":1366}],"name":"test_getOffsetFromLocal_Moscow_Autumn","pass":true,"statements":[{"sl":891},{"sl":892},{"sl":893},{"sl":894},{"sl":896},{"sl":897},{"sl":898},{"sl":899},{"sl":900},{"sl":902},{"sl":903},{"sl":904},{"sl":905},{"sl":906},{"sl":907},{"sl":908},{"sl":1355},{"sl":1359},{"sl":1367},{"sl":1368},{"sl":1369},{"sl":1370},{"sl":1371}]},"test_4001":{"methods":[{"sl":1246}],"name":"testPeriod","pass":true,"statements":[{"sl":1247},{"sl":1248},{"sl":1249},{"sl":1250}]},"test_4093":{"methods":[{"sl":1337}],"name":"testDateTimeCreation_newYork","pass":true,"statements":[{"sl":1338},{"sl":1339},{"sl":1340},{"sl":1341}]},"test_4116":{"methods":[{"sl":252}],"name":"test_DateTime_parse_Gaza","pass":true,"statements":[{"sl":253},{"sl":254},{"sl":257}]},"test_4131":{"methods":[{"sl":1159}],"name":"testWithMillisOfSecondInDstChange_Paris_summer","pass":true,"statements":[{"sl":1160},{"sl":1161},{"sl":1162},{"sl":1163}]},"test_4174":{"methods":[{"sl":697}],"name":"test_DateTime_roundFloor_day_NewYork_Autumn_preCutover","pass":true,"statements":[{"sl":698},{"sl":699},{"sl":700},{"sl":701}]},"test_4178":{"methods":[{"sl":746}],"name":"test_DateTime_roundFloor_secondOfMinute_NewYork_Autumn_postCutover","pass":true,"statements":[{"sl":747},{"sl":748},{"sl":749},{"sl":750}]},"test_4179":{"methods":[{"sl":596}],"name":"test_DateTime_roundCeiling_day_NewYork_Spring_postCutover","pass":true,"statements":[{"sl":597},{"sl":598},{"sl":599},{"sl":600}]},"test_4187":{"methods":[{"sl":668}],"name":"test_DateTime_plusHour_NewYork_Autumn","pass":true,"statements":[{"sl":669},{"sl":670},{"sl":672},{"sl":673},{"sl":674},{"sl":675},{"sl":676},{"sl":677},{"sl":678},{"sl":679}]},"test_4205":{"methods":[{"sl":1152}],"name":"testWithSecondOfMinuteInDstChange","pass":true,"statements":[{"sl":1153},{"sl":1154},{"sl":1155},{"sl":1156}]},"test_448":{"methods":[{"sl":1316}],"name":"testDateTimeCreation_athens","pass":true,"statements":[{"sl":1317},{"sl":1318},{"sl":1319},{"sl":1320}]},"test_460":{"methods":[{"sl":789}],"name":"test_DateTime_roundCeiling_minuteOfHour_NewYork_Autumn_postCutover","pass":true,"statements":[{"sl":790},{"sl":791},{"sl":792},{"sl":793}]},"test_471":{"methods":[{"sl":127}],"name":"test_DateTime_withDay_Gaza","pass":true,"statements":[{"sl":128},{"sl":129},{"sl":130},{"sl":131}]},"test_477":{"methods":[{"sl":1173}],"name":"testWithMillisOfSecondInDstChange_NewYork_summer","pass":true,"statements":[{"sl":1174},{"sl":1175},{"sl":1176},{"sl":1177}]},"test_491":{"methods":[{"sl":940}],"name":"test_DateTime_minusHour_Moscow_Autumn","pass":true,"statements":[{"sl":941},{"sl":942},{"sl":944},{"sl":945},{"sl":946},{"sl":947},{"sl":948},{"sl":949},{"sl":950},{"sl":951}]},"test_537":{"methods":[{"sl":739}],"name":"test_DateTime_roundFloor_secondOfMinute_NewYork_Autumn_preCutover","pass":true,"statements":[{"sl":740},{"sl":741},{"sl":742},{"sl":743}]},"test_539":{"methods":[{"sl":449}],"name":"test_DateTime_new_Turk","pass":true,"statements":[{"sl":450},{"sl":451},{"sl":454}]},"test_581":{"methods":[{"sl":852}],"name":"test_DateTime_setHourForward_Moscow_Spring","pass":true,"statements":[{"sl":853},{"sl":854},{"sl":856},{"sl":857}]},"test_602":{"methods":[{"sl":761}],"name":"test_DateTime_roundCeiling_day_NewYork_Autumn_postCutover","pass":true,"statements":[{"sl":762},{"sl":763},{"sl":764},{"sl":765}]},"test_609":{"methods":[{"sl":803}],"name":"test_DateTime_roundCeiling_secondOfMinute_NewYork_Autumn_postCutover","pass":true,"statements":[{"sl":804},{"sl":805},{"sl":806},{"sl":807}]},"test_626":{"methods":[{"sl":279},{"sl":293}],"name":"test_getOffsetFromLocal_Turk","pass":true,"statements":[{"sl":280},{"sl":281},{"sl":282},{"sl":283},{"sl":284},{"sl":285},{"sl":286},{"sl":287},{"sl":288},{"sl":289},{"sl":290},{"sl":294},{"sl":295},{"sl":296},{"sl":297},{"sl":298}]},"test_664":{"methods":[{"sl":1088}],"name":"test_DateTime_JustAfterLastEverOverlap","pass":true,"statements":[{"sl":1090},{"sl":1098},{"sl":1099},{"sl":1101},{"sl":1102}]},"test_711":{"methods":[{"sl":322}],"name":"test_DateTime_setHourZero_Turk","pass":true,"statements":[{"sl":323},{"sl":324},{"sl":325},{"sl":326}]},"test_786":{"methods":[{"sl":581}],"name":"test_DateTime_roundFloor_minute_NewYork_Spring_postCutover","pass":true,"statements":[{"sl":582},{"sl":583},{"sl":584},{"sl":585}]},"test_798":{"methods":[{"sl":704}],"name":"test_DateTime_roundFloor_day_NewYork_Autumn_postCutover","pass":true,"statements":[{"sl":705},{"sl":706},{"sl":707},{"sl":708}]},"test_85":{"methods":[{"sl":61}],"name":"test_MockGazaIsCorrect","pass":true,"statements":[{"sl":62},{"sl":63},{"sl":64},{"sl":65},{"sl":66},{"sl":67}]},"test_868":{"methods":[{"sl":498},{"sl":1354},{"sl":1366}],"name":"test_getOffsetFromLocal_NewYork_Spring","pass":true,"statements":[{"sl":499},{"sl":500},{"sl":502},{"sl":503},{"sl":505},{"sl":506},{"sl":507},{"sl":508},{"sl":509},{"sl":510},{"sl":511},{"sl":1355},{"sl":1367},{"sl":1368},{"sl":1369},{"sl":1370},{"sl":1371}]},"test_880":{"methods":[{"sl":134}],"name":"test_DateTime_minusHour_Gaza","pass":true,"statements":[{"sl":135},{"sl":136},{"sl":138},{"sl":139},{"sl":140},{"sl":141},{"sl":142},{"sl":143}]},"test_899":{"methods":[{"sl":116}],"name":"test_DateTime_withHourZero_Gaza","pass":true,"statements":[{"sl":117},{"sl":118},{"sl":119},{"sl":120}]},"test_935":{"methods":[{"sl":270}],"name":"test_MockTurkIsCorrect","pass":true,"statements":[{"sl":271},{"sl":272},{"sl":273},{"sl":274},{"sl":275},{"sl":276}]},"test_952":{"methods":[{"sl":636}],"name":"test_NewYorkIsCorrect_Autumn","pass":true,"statements":[{"sl":637},{"sl":638},{"sl":639},{"sl":640},{"sl":641},{"sl":642}]},"test_954":{"methods":[{"sl":962}],"name":"test_GuatemataIsCorrect_Autumn","pass":true,"statements":[{"sl":963},{"sl":964},{"sl":965},{"sl":966},{"sl":967},{"sl":968}]},"test_969":{"methods":[{"sl":206}],"name":"test_MutableDateTime_withZoneRetainFields_Gaza","pass":true,"statements":[{"sl":207},{"sl":208},{"sl":210},{"sl":211}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [85], [85], [85], [85], [85], [85], [85], [], [], [2004], [2004], [2004], [2004], [2004], [2004], [2004], [2004], [2004], [2004], [2004], [2004], [], [], [2004], [2004], [2004], [2004], [2004], [], [], [2743], [2743], [2743], [2743], [2743], [], [], [1841], [1841], [1841], [1841], [1841], [], [], [3750], [3750], [3750], [3750], [3750], [], [], [], [], [], [], [899], [899], [899], [899], [899], [], [], [], [], [], [], [471], [471], [471], [471], [471], [], [], [880], [880], [880], [], [880], [880], [880], [880], [880], [880], [], [], [2621], [2621], [2621], [], [2621], [2621], [2621], [2621], [2621], [2621], [], [], [2929], [2929], [2929], [], [2929], [2929], [2929], [2929], [], [], [2580], [2580], [2580], [], [2580], [2580], [2580], [2580], [], [], [3699], [3699], [3699], [], [3699], [3699], [3699], [3699], [], [], [1829], [1829], [1829], [], [1829], [1829], [1829], [1829], [], [], [279], [279], [279], [], [279], [279], [], [], [969], [969], [969], [], [969], [969], [], [], [3709], [3709], [3709], [], [3709], [3709], [], [], [2108], [2108], [2108], [2108], [], [], [2108], [], [], [], [1618], [1618], [1618], [], [], [1618], [], [], [], [2799], [2799], [2799], [2799], [2799], [2799], [2799], [2799], [2799], [], [], [4116], [4116], [4116], [], [], [4116], [], [], [], [], [], [], [], [], [], [], [], [], [935], [935], [935], [935], [935], [935], [935], [], [], [626], [626], [626], [626], [626], [626], [626], [626], [626], [626], [626], [626], [], [], [626], [626], [626], [626], [626], [626], [], [], [3566], [3566], [3566], [3566], [3566], [], [], [1958], [1958], [1958], [1958], [1958], [], [], [2072], [2072], [2072], [2072], [2072], [], [], [711], [711], [711], [711], [711], [], [], [], [], [], [], [3176], [3176], [3176], [3176], [3176], [], [], [], [], [], [], [3718], [3718], [3718], [3718], [3718], [], [], [2323], [2323], [2323], [], [2323], [2323], [2323], [2323], [2323], [2323], [], [], [2148], [2148], [2148], [], [2148], [2148], [2148], [2148], [2148], [2148], [], [], [3986], [3986], [3986], [], [3986], [3986], [3986], [3986], [], [], [3379], [3379], [3379], [], [3379], [3379], [3379], [3379], [], [], [3063], [3063], [3063], [], [3063], [3063], [3063], [3063], [], [], [3804], [3804], [3804], [], [3804], [3804], [3804], [3804], [], [], [3787], [3787], [3787], [], [3787], [3787], [], [], [3557], [3557], [3557], [], [3557], [3557], [], [], [2269], [2269], [2269], [], [2269], [2269], [], [], [3199], [3199], [3199], [3199], [], [], [3199], [], [], [], [539], [539], [539], [], [], [539], [], [], [], [1245], [1245], [1245], [1245], [1245], [1245], [1245], [1245], [], [], [3350], [3350], [3350], [], [], [3350], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1269], [1269], [1269], [1269], [1269], [1269], [1269], [], [], [868], [868], [868], [], [868], [868], [], [868], [868], [868], [868], [868], [868], [868], [], [], [2874], [2874], [2874], [2874], [2874], [], [], [3829], [3829], [3829], [], [3829], [3829], [], [], [], [], [], [], [1450], [1450], [1450], [], [1450], [1450], [], [], [], [], [], [], [], [1819], [1819], [1819], [1819], [1819], [], [], [2992], [2992], [2992], [2992], [2992], [], [], [2659], [2659], [2659], [2659], [2659], [], [], [1844], [1844], [1844], [1844], [1844], [], [], [1921], [1921], [1921], [1921], [1921], [], [], [786], [786], [786], [786], [786], [], [], [], [3860], [3860], [3860], [3860], [3860], [], [], [4179], [4179], [4179], [4179], [4179], [], [], [1476], [1476], [1476], [1476], [1476], [], [], [3191], [3191], [3191], [3191], [3191], [], [], [1104], [1104], [1104], [1104], [1104], [], [], [3136], [3136], [3136], [3136], [3136], [], [], [], [], [], [], [], [952], [952], [952], [952], [952], [952], [952], [], [], [1825], [1825], [1825], [], [1825], [1825], [], [1825], [1825], [1825], [1825], [1825], [1825], [1825], [1825], [1825], [], [], [329], [329], [329], [], [], [4187], [4187], [4187], [], [4187], [4187], [4187], [4187], [4187], [4187], [4187], [4187], [], [], [3], [3], [3], [], [3], [3], [3], [3], [3], [3], [3], [3], [], [], [], [4174], [4174], [4174], [4174], [4174], [], [], [798], [798], [798], [798], [798], [], [], [2492], [2492], [2492], [2492], [2492], [], [], [3734], [3734], [3734], [3734], [3734], [], [], [3975], [3975], [3975], [3975], [3975], [], [], [3532], [3532], [3532], [3532], [3532], [], [], [537], [537], [537], [537], [537], [], [], [4178], [4178], [4178], [4178], [4178], [], [], [], [2901], [2901], [2901], [2901], [2901], [], [], [602], [602], [602], [602], [602], [], [], [3639], [3639], [3639], [3639], [3639], [], [], [1482], [1482], [1482], [1482], [1482], [], [], [38], [38], [38], [38], [38], [], [], [460], [460], [460], [460], [460], [], [], [1352], [1352], [1352], [1352], [1352], [], [], [609], [609], [609], [609], [609], [], [], [], [], [], [], [], [], [2971], [], [], [], [], [2971], [2971], [2971], [2971], [2971], [2971], [], [], [240], [240], [240], [], [240], [240], [], [240], [240], [240], [240], [240], [240], [240], [], [], [2330], [2330], [2330], [2330], [2330], [], [], [581], [581], [581], [], [581], [581], [], [], [], [], [], [], [3669], [3669], [3669], [], [3669], [3669], [], [], [], [], [], [], [], [], [], [], [], [1163], [1163], [1163], [1163], [1163], [1163], [1163], [], [], [3987], [3987], [3987], [3987], [3987], [], [3987], [3987], [3987], [3987], [3987], [], [3987], [3987], [3987], [3987], [3987], [3987], [3987], [], [], [2101], [2101], [2101], [2101], [], [2101], [], [], [], [], [2601], [2601], [2601], [], [], [2597], [2597], [2597], [], [2597], [2597], [2597], [2597], [2597], [2597], [2597], [2597], [], [], [491], [491], [491], [], [491], [491], [491], [491], [491], [491], [491], [491], [], [], [], [], [], [], [], [], [], [], [954], [954], [954], [954], [954], [954], [954], [], [], [2669], [2669], [], [2669], [], [], [2669], [], [2669], [], [], [2669], [], [2669], [], [2669], [], [2669], [], [2669], [], [2669], [], [2669], [], [2669], [], [2669], [], [2669], [], [2669], [], [2669], [], [2669], [], [2669], [], [], [], [1649], [1649], [1649], [], [1649], [1649], [1649], [1649], [1649], [1649], [1649], [1649], [1649], [1649], [1649], [1649], [1649], [1649], [], [], [1249], [1249], [1249], [], [1249], [1249], [1249], [1249], [1249], [1249], [1249], [1249], [1249], [1249], [1249], [1249], [1249], [1249], [], [], [], [], [], [], [], [], [], [], [2094], [2094], [2094], [2094], [2094], [2094], [2094], [], [], [1183], [1183], [1183], [], [1183], [1183], [], [1183], [1183], [1183], [1183], [1183], [1183], [], [], [], [], [], [], [664], [], [664], [], [], [], [], [], [], [], [664], [664], [], [664], [664], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3842], [3842], [3842], [3842], [3842], [3842], [3842], [3842], [], [3842], [3842], [3842], [3842], [], [3842], [3842], [3842], [3842], [], [], [1089], [1089], [1089], [1089], [1089], [], [], [1638], [1638], [1638], [1638], [1638], [], [], [4205], [4205], [4205], [4205], [4205], [], [], [4131], [4131], [4131], [4131], [4131], [], [], [3823], [3823], [3823], [3823], [3823], [], [], [477], [477], [477], [477], [477], [], [], [1634], [1634], [1634], [1634], [1634], [], [], [3034], [3034], [3034], [3034], [3034], [], [], [2279], [2279], [2279], [2279], [2279], [], [], [3314], [3314], [3314], [3314], [3314], [], [], [3178], [3178], [3178], [3178], [3178], [3178], [3178], [], [3178], [3178], [3178], [3178], [3178], [3178], [3178], [3178], [3178], [], [], [2826], [2826], [2826], [2826], [2826], [2826], [2826], [], [2826], [2826], [2826], [2826], [2826], [2826], [2826], [2826], [2826], [], [], [4001], [4001], [4001], [4001], [4001], [], [], [1817], [1817], [1817], [1817], [1817], [1817], [1817], [], [1817], [1817], [], [], [], [2462], [2462], [2462], [2462], [2462], [], [2462], [2462], [], [2462], [2462], [], [2462], [2462], [], [], [289], [289], [289], [289], [289], [], [289], [289], [], [289], [289], [], [289], [289], [], [], [283], [283], [283], [283], [283], [], [283], [283], [], [283], [283], [], [283], [283], [], [], [], [], [448], [448], [448], [448], [448], [], [], [1240], [1240], [1240], [1240], [1240], [], [], [3882], [3882], [3882], [3882], [3882], [], [], [4093], [4093], [4093], [4093], [4093], [], [], [3659], [3659], [3659], [3659], [3659], [], [], [], [], [], [2101, 240, 868, 3987, 1825], [2101, 240, 868, 3987, 1825], [], [], [3987], [3987], [], [], [2669, 1183], [2669, 1183], [], [], [2669, 2101, 240, 868, 3987, 1183, 1825], [2669, 2101, 240, 868, 3987, 1183, 1825], [2669, 2101, 240, 868, 3987, 1183, 1825], [2669, 2101, 240, 868, 3987, 1183, 1825], [2669, 2101, 240, 868, 3987, 1183, 1825], [2669, 2101, 240, 868, 3987, 1183, 1825], [], [], []]
