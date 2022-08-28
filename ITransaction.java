interface ITransaction {
  String encode(String password);
  String decode(String password);
}
