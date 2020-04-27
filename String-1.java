public String withoutX(String str) {
  if (str.length() > 0 && str.substring(0,1).equals("x")) {
    if (str.length() > 1 && str.substring(str.length()-1).equals("x")) {
      return str.substring(1, str.length()-1);
    }
    return str.substring(1);
  } else if (str.length() > 1 && str.substring(str.length()-1).equals("x")) {
    return str.substring(0, str.length()-1);
  }
  return str;
}

public String withoutX2(String str) {
  String result = "";
  if(str.length() > 0 && str.charAt(0) != 'x') {
    result += str.substring(0,1);
  }
  if(str.length() > 1 && str.charAt(1) != 'x') {
    result += str.substring(1,2);
  }
  if(str.length() > 2) {
    result += str.substring(2);
  }
  return result;
}

public boolean hasBad(String str) {
  if(str.length() > 2 && str.substring(0,3).equals("bad") || str.length() > 3 && str.substring(1,4).equals("bad")) {
    return true;
  }
  return false;
}
