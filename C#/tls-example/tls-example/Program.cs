using System;
using System.Net;
using System.IO;

namespace tlsexample
{
    class MainClass
    {
        private static String BASE_URL = "https://tls12.pagar.me";

        public static void Main(string[] args)
        {
            var response = GetResponse();
            if(!response.Equals(null))
            {
                Console.WriteLine(response);
            }
        }

        private static String GetResponse()
        {
            HttpWebRequest request = WebRequest.CreateHttp(BASE_URL);

            request.UserAgent = "pagarme-net/tls-example";
            request.Method = "GET";
            try
            {
                HttpWebResponse response = (HttpWebResponse)request.GetResponse();
                Stream dataStream = response.GetResponseStream();
                StreamReader reader = new StreamReader(dataStream);
                return reader.ReadToEnd();
            } catch(Exception e) {
                Console.WriteLine("Got error! \n" + e.Message);
            }

            return null;
        }
    }
}
