package xox.lol.data;

class SocialMedia {

    String name;
    
}

class Facebook extends SocialMedia{

    final void logn(String username, String password) {

    } 
}

class FakeFacebook extends Facebook{

    // INI JADI ERROR KARENA METHOD SEBELUMNYA MENGGUNAKAN FINAL METHOD
    // final void logn(String username, String password) {

    // } 
}
