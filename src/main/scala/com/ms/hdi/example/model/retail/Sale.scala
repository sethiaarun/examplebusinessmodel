package com.ms.hdi.example.model.retail

import com.ms.hdi.example.model.BaseDataGen

/**
 * Sales data
 * @param customerId customer id
 * @param date sale date/tx date
 * @param saleQty sale qty
 * @param itemId sale Item Id
 * @param saleValue sale value
 */
case class Sale(customerId:Int, date:String, saleQty: Int, itemId: Int, saleValue: Float) extends BaseDataGen
