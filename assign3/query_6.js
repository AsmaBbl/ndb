printjson(
  db.people.insert({
    sex: "Female",
    first_name: "Asma",
    last_name: "Boujbel",
    job: "Data Analyst",
    email: "xy2020@gmail.com",
    location: {
      city: "Warsaw",
      address: {
        streetname: "NY street",
        streetnumber: "29"
      }
    },
    description: "Nam neque neque feugiat sed blandit quis feugiat et magna.",
    height: "176",
    weight: "57.4",
    birth_date: "1994-09-17T20:20:20Z",
    nationality: "Tunisian",
    credit: [
          { type: "lmn",
            number: "1254869210386",
            currency: "USD",
            blance: "10500"
          }
    ]
  })
);

