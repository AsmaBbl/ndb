printjson(db.ollection.find({ birth_date: { $gte: new Date("2000-01-01T00:00:00Z").toISOString() }}, { first_name: 1, last_name: 1 }).toArray()) 
