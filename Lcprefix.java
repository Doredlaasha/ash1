import java.io.*;
string Lcprefix.(vector<string> str) 
{
  if (str.size() == 0) 
  return "";
 
string res = "";
 
for (int i = 0; i < str[0].length(); i++) 
{
  
 ok = true; 
  for (int j = 1; j < str.size(); j++) 
  {
  if (i >= str[j].length() || str[j][i] != str[0][i]) 
 {
  ok = false;
  break;
  }
  }
  if (!ok)
  {
  then 
  break;
  }
 res.push_back(str[0][i]);
  }
  return res;
}
