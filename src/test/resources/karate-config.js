function karateConf() {
  //set up runtime variables based on environment
  //get system property 'karate.env'
 var env = karate.env;
 karate.log('karate.env ------>', karate.env);

 var config = {
     baseUrl : 'http://localhost:8080'
 };

 if (env == 'local') {
   config.baseUrl = 'http://localhost:8080';
 }
 else if (env == 'qa') { //Pre-production environment settings
   config.baseUrl = '';
 }else {
   config.baseUrl = 'http://localhost:8080';
 }

 karate.log('config.baseUrl ------>', config.baseUrl);
 return config;
}