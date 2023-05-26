package com.ms.hdi.example.model.retail

import com.ms.hdi.example.model.BaseDataGen

/**
 * Sales data
 * @param customerId customer id
 * @param date sale date/tx date
 * @param saleQty sale qty
 * @param item Sale Item
 */
case class Sale(customerId:Int, date:String, saleQty: Int, item:Item) extends BaseDataGen
