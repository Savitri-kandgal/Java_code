<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display page</title>
<style>
#state {
  font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 50%;
}

#state td, #state th {
  border: 1px solid #ddd;
  padding: 5px;
}

#state tr:nth-child(even){background-color: #f2f2f2;}

#state tr:hover {background-color: #ddd;}

#state th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #04AA6D;
  color: white;
}
</style>
</head>
<body>
<h3 style="color: Red;">State details:</h3>
<table id="state">
  <tr>
  <th>Sr.No</th>
  <th>Properties</th>
  <th>Values</th>
  </tr>
  <tr>
    <td>1</td>
    <td>Name:</td>
    <td>
  <%= request.getParameter("name") %>
    </td>
  </tr>
<tr>
<td>2
</td>
<td> 
Capital City:
</td>
<td>
<%= request.getParameter("cc") %>
</td>
</tr>
<tr>
<td> 
3
</td>
<td> 
Nick Name:
</td>
<td>
<%= request.getParameter("nName") %>
</td>
</tr>
<tr>
<td>
4
</td>
<td>
State Code:
</td>
<td>
<%= request.getParameter("code") %>
</td>
</tr>
<tr>
<td>
5
</td>
<td>
Motto: 
</td>
<td>
<%= request.getParameter("motto") %>
</td>
</tr>
<tr>
<td>
6
</td>
<td>
Anthem:
</td>
<td>
<%= request.getParameter("anthem") %>
</td>
</tr>
<tr>
<td>
7
</td>
<td>
Country: 
</td>
<td>
<%= request.getParameter("country") %>
</td>
</tr>
<tr>
<td>
8
</td>
<td> Region:</td>
<td> <%= request.getParameter("region") %>
</td>
</tr>
<tr>
<td>
9</td>
<td> Previous Name:</td>
<td> <%= request.getParameter("pn") %>
</td>
</tr>
<tr>
<td>
10</td>
<td>Formation Date: </td>
<td><%= request.getParameter("fd") %>
</td>
</tr>
<tr>
<td>
11</td>
<td> Largest City:</td>
<td> <%= request.getParameter("lc") %>
</td>
</tr>
<tr>
<td>
12</td>
<td> Largest Metro: </td>
<td><%= request.getParameter("lm") %>
</td>
</tr>
<tr>
<td>
13</td>
<td>Total Districts:</td>
<td> <%= request.getParameter("districts") %>
</td>
</tr>
<tr>
<td>
14</td>
<td> Government body:</td>
<td><%= request.getParameter("gb") %>
</td>
</tr>
<tr>
<td>
15</td>
<td>Governor:</td>
<td> <%= request.getParameter("governor") %>
</td>
</tr>
<tr>
<td>
16</td>
<td> CM: </td>
<td><%= request.getParameter("cm") %>
</td>
</tr>
<tr>
<td>
17</td>
<td> Deputy CM:</td>
<td> <%= request.getParameter("dpm") %>
</td>
</tr>
<tr>
<td>
18</td>
<td> Chief Secretary:</td>
<td> <%= request.getParameter("cs") %>
</td>
</tr>
<tr>
<td>
19</td>
<td> state legislature:</td>
<td> <%= request.getParameter("sl") %>
</td>
</tr>
<tr>
<td>
20</td>
<td> Council:</td>
<td> <%= request.getParameter("council") %>
</td>
</tr>
<tr>
<td>
21</td>
<td> Assembly: </td>
<td><%= request.getParameter("assembly") %>
</td>
</tr>
<tr>
<td>
22</td>
<td> National Parliament:</td>
<td> <%= request.getParameter("np") %>
</td>
</tr>
<tr>
<td>
23</td>
<td> Rajya Sabha:</td>
<td> <%= request.getParameter("rs") %>
</td>
</tr>
<tr>
<td>
24</td>
<td> Lok Sabha:</td>
<td> <%= request.getParameter("ls") %>
</td>
</tr>
<tr>
<td>
25</td>
<td>High Court:</td>
<td> <%= request.getParameter("hc") %>
</td>
</tr>
<tr>
<td>

26. </td>
<td>Area Rank:</td>
<td> <%= request.getParameter("ar") %>
</td>
</tr>
<tr>
<td>
27</td>
<td>Total Area: </td>
<td><%= request.getParameter("ta") %>
</td>
</tr>
<tr>
<td>

28</td>
<td> Length:</td>
<td> <%= request.getParameter("length") %>
</td>
</tr>
<tr>
<td>
29</td>
<td> Width:</td>
<td> <%= request.getParameter("width") %>
</td>
</tr>
<tr>
<td>

30</td>
<td> Total:</td>
<td> <%= request.getParameter("total") %>
</td>
</tr>
<tr>
<td>
31</td>
<td> Rank:</td>
<td> <%= request.getParameter("rank") %>
</td>
</tr>
<tr>
<td>
32</td>
<td> Density:</td>
<td> <%= request.getParameter("density") %>
</td>
</tr>
<tr>
<td>
33</td>
<td> Urban:</td>
<td> <%= request.getParameter("urban") %>
</td>
</tr>
<tr>
<td>
34</td>
<td> Rural:</td>
<td> <%= request.getParameter("rural") %>
</td>
</tr>
<tr>
<td>
35. </td>
<td>Demonym(s):</td>
<td> <%= request.getParameter("demonym") %>
</td>
</tr>
<tr>
<td>
36</td>
<td> unemployment rate: </td>
<td><%= request.getParameter("unemployment") %>
</td>
</tr>
<tr>
<td>
37</td>
<td>Official:</td>
<td> <%= request.getParameter("Officials") %>
</td>
</tr>
<tr>
<td>
38</td>
<td>Official script:</td>
<td> <%= request.getParameter("script") %>
</td>
</tr>
<tr>
<td>
39</td>
<td>Time zone: </td>
<td><%= request.getParameter("tz") %>
</td>
</tr>
<tr>
<td>
40</td>
<td>Vehicle registration:</td>
<td> <%= request.getParameter("vr") %>
</td>
</tr>
<tr>
<td>
41</td>
<td>ISO 3166 code: </td>
<td><%= request.getParameter("iso") %>
</td>
</tr>
<tr>
<td>
42</td>
<td> Website: </td>
<td><%= request.getParameter("website") %>
</td>
</tr>
<tr>
<td>
43</td>
<td>Symbols of Karnataka:</td>
<td> <%= request.getParameter("sk") %>
</td>
</tr>
<tr>
<td>
44</td>
<td>Song:</td>
<td> <%= request.getParameter("song") %>
</td>
</tr>
<tr>
<td>
45</td>
<td>Bird: </td>
<td><%= request.getParameter("bird") %>
</td>
</tr>
<tr>
<td>
46</td>
<td> Flower:</td>
<td> <%= request.getParameter("flower") %>
</td>
</tr>
<tr>
<td>
47</td>
<td>Mammal:</td>
<td> <%= request.getParameter("mammal") %>
</td>
</tr>
<tr>
<td>
48</td>
<td> Tree: </td>
<td><%= request.getParameter("tree") %>
</td>
</tr>
<tr>
<td>
49</td>
<td> Flag:</td>
<td> <%= request.getParameter("flag") %>
</td>
</tr>
<tr>
<td>
50</td>
<td>Biggest river: </td>
<td><%= request.getParameter("river") %>
</td>
</tr>
<tr>
<td>
51</td>
<td> Famous temples: </td>
<td><%= request.getParameter("temple") %>
</td>
</tr>
<tr>
<td>
52</td>
<td> Traditional dress: </td>
<td><%= request.getParameter("dress") %>
</td>
</tr>
<tr>
<td>
53</td>
<td>Famous food: </td>
<td><%= request.getParameter("food") %>
</td>
</tr>
<tr>
<td>
54</td>
<td> Traditional dance:</td>
<td> <%= request.getParameter("dance") %>
</td>
</tr>
<tr>
<td>
55</td>
<td> Airports: </td>
<td><%= request.getParameter("airports") %>
</td>
</tr>
<tr>
<td>
56</td>
<td>No. of Villages:</td>
<td> <%= request.getParameter("villages") %>
</td>
</tr>
<tr>
<td>
57</td>
<td> lowest temparature place:</td>
<td> <%= request.getParameter("lTemp") %>
</td>
</tr>
<tr>
<td>
58</td>
<td>First inscription:</td>
<td> <%= request.getParameter("inscription") %>
</td>
</tr>
<tr>
<td>

59</td>
<td>Statue Name: </td>
<td><%= request.getParameter("sn") %>
</td>
</tr>
<tr>
<td>
60</td>
<td>Height: </td>
<td><%= request.getParameter("height") %>
</td>
</tr>
<tr>
<td>
61</td>
<td>Location: </td>
<td><%= request.getParameter("location") %>
</td>
</tr>
<tr>
<td>
62</td>
<td> Home minister: </td>
<td><%= request.getParameter("homeMinister") %>
</td>
</tr>
<tr>
<td>
63</td>
<td> Film Name: </td>
<td><%= request.getParameter("film") %>
</td>
</tr>
<tr>
<td>
64</td>
<td>Director: </td>
<td><%= request.getParameter("director") %>
</td>
</tr>
<tr>
<td>
65</td>
<td>Year: </td>
<td><%= request.getParameter("year") %>
</td>
</tr>
<tr>
<td>
66</td>
<td> Gross:</td>
<td> <%= request.getParameter("gross") %>
</td>
</tr>
</table>
</body>
</html>